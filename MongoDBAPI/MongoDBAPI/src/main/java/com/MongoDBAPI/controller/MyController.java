package com.MongoDBAPI.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.MongoDBAPI.Hospital;
import com.MongoDBAPI.repo.HospitalRepository;
import com.MongoDBAPI.repo.HospitalService;

@RestController
@RequestMapping("/hospital")
public class MyController {
	
	@Autowired
	private HospitalRepository hr;
	
	@Autowired
	private HospitalService hs;
	
	@GetMapping("/findallpatient")
	public List<Hospital> getAllPatient(){
		return hr.findAll();
	}
	
	@GetMapping("/findpatient/{id}")
	public Optional<Hospital> getPatient(@PathVariable("id") int id){
		return hr.findById(id);
	}
	
	@PostMapping("/addpatient")
	public String addPatient(@RequestBody Hospital h)
	{
		hr.save(h);
		return "Patient is added with Id: "+h.getPatientId();
	}
	
	@DeleteMapping("/deletepatient/{id}")
	public String deletePatient(@PathVariable("id") int id){
		hr.deleteById(id);
		return "Patient is deleted with Id: "+id;
	}
	
	@PutMapping("/updatepatient/{id}")
	public void updatePatient(@PathVariable("id") int id,@RequestBody Hospital h) {
		hs.updatePatient(h, id);
	}
}
