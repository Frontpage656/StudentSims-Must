package com.example.studentsims.Controller;

import com.example.studentsims.Entity.Student;
import com.example.studentsims.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Let's have handle method to handle list of students and return model and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String registerStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "student_form";
    }

    @PostMapping("/student")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }


//    @GetMapping("/students")
//    public List<Student> getListStudents() {
//        return studentService.getAllStudents();
//    }

    // Let's handle the update method
    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));

        return "edit_student";
    }

    @PostMapping("students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {
        //get the existing student from database by id
        Student existingStudent = studentService.getStudentById(id);

        existingStudent.setId(id);
        existingStudent.setfName(student.getfName());
        existingStudent.setsName(student.getsName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setRegNumber(student.getRegNumber());

        // Save updated student
        studentService.updateStudent(existingStudent);

        return "redirect:/students";

    }

    @GetMapping("/students/{id}")
    public String StringDeleteStudent(@PathVariable Long id) {
          studentService.deleteStudentById(id);
          return "redirect:/students";
    }

}
