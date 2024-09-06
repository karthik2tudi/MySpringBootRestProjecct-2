package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.BankAccount;
import com.rt.entity.PanDetails;
import com.rt.entity.Person;

@RestController
@RequestMapping(path = "/indian")
public class PersonController {
	

	
	@GetMapping(path = "/getPerson")
	public ResponseEntity<?> checkreturnType(){
		BankAccount bankAccount1 = BankAccount.builder().bankAcctNo("1013345543").bankCode("ICICI01").branch("Madhapur").build();
		BankAccount bankAccount2 = BankAccount.builder().bankAcctNo("1013345544").bankCode("HDFC").branch("Madhapur").build();
		List<BankAccount> listBank = List.of(bankAccount1,bankAccount2);
		
		PanDetails details = PanDetails.builder().panNo("AWWPT8576S").name("ajay").barcode("====").bankAccounts(listBank).build();
		
		Person person = Person.builder().pid(101).pname("kiran").address("hyd")
				           .nickNames(List.of("chintu","Bantu","nani")).panDetails(details)
				           .build();
		
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

}
