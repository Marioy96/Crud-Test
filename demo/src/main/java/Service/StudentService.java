package Service;

import entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class StudentService {

    public static void insertNewStudent(Student newStudent) {
    }

    public void ChangeValueisWorking(Student newStudent) {

    }

    public List<Student> getAllStudents() {
        return (List<Student>) this;
    }


    public static void deleteStudent(int id) {
    }
}
