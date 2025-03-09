package com.example.demo.AllController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employ;
import com.example.demo.ServiceClasses.SercieClass;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	
@Autowired
SercieClass sc;


@PostMapping("/user")
public String insertData(@RequestBody Employ emp) {
	sc.saveData(emp);
	return "data send";
}
@GetMapping("/user")
public List<Employ>getAllData(){
	
	return sc.getAllData();
}
}
