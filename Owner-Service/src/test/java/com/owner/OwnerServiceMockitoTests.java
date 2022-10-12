package com.owner;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.owner.model.Owner;
import com.owner.repository.OwnerRepository;
import com.owner.resource.OwnerResource;
import com.owner.service.OwnerService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
public class OwnerServiceMockitoTests {

	@Mock
	OwnerRepository ownerRepository;
	
	public List<Owner> owners;
	
	@InjectMocks
	OwnerResource ownerResource;
	
	@InjectMocks
	OwnerService service;
//	@GetMapping("/owner")
//	public List<Owner> findAllowner() {
//		return service.getOwnerInfos();
//	}
	
	@Test
	void test_findAllowner() {
		//Create List of type Owner
				List<Owner> owners= new ArrayList<Owner>();
				
				//Add Owner details in ArrayList
				owners.add(new Owner(1,"apeksha","apeksha"));  
				owners.add(new Owner(2,"sharvari","sharvari"));  	
				owners.add(new Owner(3,"varad","varad"));  	
				System.out.println(service.getOwnerInfos().size());
		     when(ownerRepository.findAll()).thenReturn(owners);
			 	
		     assertEquals(3,service.getOwnerInfos().size());
		     //return service.getOwnerInfos();
	}
	
}
