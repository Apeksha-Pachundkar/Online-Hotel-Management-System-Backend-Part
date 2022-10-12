package com.manager.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.manager.model.Staff;
import com.manager.model.StaffList;
import com.manager.service.Staffservice;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins ="http://localhost:4200" )
@RestController
public class StaffController {

	@Autowired
	Staffservice staffService;
	
	//add staff details(create)
	@PostMapping("/addEmp")
	@ApiOperation( value = "Post the staff",
    response = Staff.class)
	public Staff addEmployee(@RequestBody Staff emp) {
		return this.staffService.addEmp(emp);
	}
	
	// get staff(read)
	@ApiOperation(value = "Fetch all the staff",
		           response = Staff.class)
	@GetMapping("/getAllEmp")
	public StaffList getAllEmployee() {
		StaffList list = new StaffList();
		list.setAllEmp(this.staffService.getAllEmp());
		return list;
	}

	// get staff by id(read)
	@ApiOperation(value = "Fetch staff by staff id",
		           notes = "Provide an id of the staff and fetch the staff details",
		           response = Staff.class)
	@GetMapping("/getByEmp/{id}")
	public Optional<Staff> getEmployee(@PathVariable("id") String id) {
		return this.staffService.getEmp(Long.parseLong(id));
	}

	//update staff details
	@ApiOperation(value = "Update staff", 
		          notes = "Update the staff details", 
		          response = Staff.class)
	@PutMapping("/updateEmp")
	public Staff updateEmployee(@RequestBody Staff emp) {
		return this.staffService.updateEmp(emp);
	}

	//delete staff details
	@ApiOperation(value = "Delete staff by staff id",
		          notes = "Provide an id of the staff and delete the staff details",
		          response = Staff.class)
	@DeleteMapping("/deleteByEmp/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		return this.staffService.deleteEmp(Long.parseLong(id));
	}

}