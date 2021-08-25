package com.olive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@PostMapping("/save")
	public ResponseEntity<String> save(){
		ResponseEntity<String>  resp=new
				ResponseEntity<String>("Object Save", HttpStatus.OK);
		return resp;
	}
	
	
	@GetMapping("/fetch")
	public ResponseEntity<String> fetch(){
		ResponseEntity<String>  resp=new
				ResponseEntity<String>("Getting Object", HttpStatus.OK);
		return resp;
	}
	
	@PutMapping("/edit")
	public ResponseEntity<String> edit(){
		ResponseEntity<String>  resp=new
				ResponseEntity<String>("Editing Object", HttpStatus.OK);
		return resp;
	}
	
	@PatchMapping("/partial/edit")
	public ResponseEntity<String> partialEdit(){
		ResponseEntity<String>  resp=new
				ResponseEntity<String>(" Partial Editing Object", HttpStatus.OK);
		return resp;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(){
		ResponseEntity<String>  resp=new
				ResponseEntity<String>(" Deleting Object", HttpStatus.OK);
		return resp;
	}
	
}
