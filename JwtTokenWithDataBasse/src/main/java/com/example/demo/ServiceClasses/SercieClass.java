package com.example.demo.ServiceClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employ;
import com.example.demo.RepoClasses.RepoClass;

@Service
public class SercieClass {

	@Autowired
	RepoClass re;

	public void saveData(Employ emp) {
		re.save(emp);
		
	}

	public List<Employ> getAllData() {
		// TODO Auto-generated method stub
		return re.findAll();
	}
}
