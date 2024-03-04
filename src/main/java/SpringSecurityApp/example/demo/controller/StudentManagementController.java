package SpringSecurityApp.example.demo.controller;

import SpringSecurityApp.example.demo.entities.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("management/api/v2/students")
public class StudentManagementController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Hayat Bouchkouk")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents() {
        return students;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")

    public void registerNewStudent(@RequestBody Student student)
    {
        System.out.println("Register New Student");
        System.out.println(student);
    }

    @DeleteMapping(path = "{id}")
    @PreAuthorize("hasAuthority('student:write')")

    public void deleteStudent(@PathVariable("id") Integer id)
    {
        System.out.println("Delete Student with id " +id);
    }

    @PutMapping(path = "{id}")
    @PreAuthorize("hasAuthority('student:write')")

    public void updateStudent( @PathVariable("id") Integer id,@RequestBody Student student)
    {
        System.out.println("Update Student");
        System.out.println("the id is "+ id + " the student is : " + student);
    }
}
