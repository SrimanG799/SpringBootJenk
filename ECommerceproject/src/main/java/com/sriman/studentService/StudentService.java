package com.sriman.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriman.student.Student;
import com.sriman.studentRepo.StudentRepo;


@Service
public class StudentService {
	@Autowired
	private StudentRepo str;
	public List<Student> getAll()
	{
		return str.findAll();
		
	}
	public Student saveStudent(Student student)
	{
		return str.save(student);
	}
	public Student getById(Integer id)
	{
		return str.findById(id).get();
		
	}

}
