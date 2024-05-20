package com.sriman.studentController;

import java.util.List;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sriman.student.Student;
import com.sriman.studentService.StudentService;
@Controller
@RequestMapping("/student")
public class StudentControll {
	
Logger log=	LoggerFactory.getLogger(StudentControll.class);
	@Autowired
	
	private StudentService stuserv;
	@GetMapping({"/getAll","/list"})
	public ModelAndView getAll()
	{
		log.debug("enterd");
		ModelAndView mv=new ModelAndView("List_Student");
		List<Student> list=stuserv.getAll();
		mv.addObject("students", list);
		
		return mv;
	}
	@GetMapping("/addform")
	public ModelAndView regForm()
	
	{
		ModelAndView mv=new ModelAndView("AddStudent");
		Student s=new Student();
		mv.addObject("student",s);
		return mv;
		
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student student)
	{
		stuserv.saveStudent(student);
		return "redirect:list";
		
	}
	@GetMapping("/showUpdateForm")
	public ModelAndView getUpdate(@RequestParam("empId") Integer empId )
	{
		ModelAndView mv=new ModelAndView("UpdateForm");
		Student s=stuserv.getById(empId);
		mv.addObject("student", s);
		
		return mv;
	}
	@PostMapping("/update")
	public String updateStu(@ModelAttribute Student student)
	{
		Student ex=stuserv.getById(student.getId());
		stuserv.saveStudent(student);
		return "redirect:list";
		
		
	}
         @GetMapping("/jenkMessage")
public String msg()
{
return "Helloo Jenk2hghghgggggggffffghghhghfhfhfhhhfhghghghbbbbbbbbbf";

}
}
