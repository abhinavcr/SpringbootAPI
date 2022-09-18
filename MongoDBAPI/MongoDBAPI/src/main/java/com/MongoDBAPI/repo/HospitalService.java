package com.MongoDBAPI.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.MongoDBAPI.Hospital;

public class HospitalService {
	private static List<Hospital> list=new ArrayList<>();
	
	public void updatePatient(Hospital h, int id) {
		list=list.stream().map(e2->{
			if(e2.getPatientId()==id)
			{
				e2.setPatientName("Nick Jones");
				e2.setContactNumber(5);
			}
			return e2;
	 }).collect(Collectors.toList());
	}
}
