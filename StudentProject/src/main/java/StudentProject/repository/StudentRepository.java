package StudentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import StudentProject.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}