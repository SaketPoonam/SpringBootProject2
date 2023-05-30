package StudentProject.StudentResource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import StudentProject.Exception.StudentNotFoundException;
import StudentProject.dto.Student;
import StudentProject.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentResource {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping()
    public List<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }

 
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getUser(@PathVariable Integer id){
        Optional<Student> student = studentRepository.findById(id);

        if (student.isEmpty())
        	
            throw new  StudentNotFoundException ("id-" + id);

        ResponseEntity<Student> resource = ResponseEntity.of(student.get());

        WebMvcLinkBuilder linkTo = linkTo( methodOn(this.getClass()).retrieveAllStudents());

        resource.add(linkTo.withRel("all-students"));

        return resource;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }

    @PostMapping()
    public ResponseEntity<Object> createStudent(@Valid @RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudent.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateStudent(@Valid @RequestBody Student student, @PathVariable long id) {

        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isEmpty())
            return ResponseEntity.notFound().build();

        student.setId(id);

        studentRepository.save(student);

        return ResponseEntity.noContent().build();
    }
}