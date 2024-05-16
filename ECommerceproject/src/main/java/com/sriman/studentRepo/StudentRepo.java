package com.sriman.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.sriman.student.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
