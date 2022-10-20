package Controller;

import Service.StudentService;
import entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CRUDcontroller {


    @Autowired
    StudentService studentService;

    @PostMapping("/insertNewStudent")
    public ResponseEntity<Student> insertNewAuthor(@RequestBody Student newStudent) {
        StudentService.insertNewStudent(newStudent);
        return new ResponseEntity<Student>(newStudent, HttpStatus.OK);


    }

    @GetMapping("/getAllAuthors")
    public List<Student> getAllAuthors() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("/deleteAuthor")
    public ResponseEntity<Student> deleteAuthor(@RequestParam int id) {
        StudentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
