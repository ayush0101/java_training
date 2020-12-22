package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.BugTrackingIssues;
import com.example.demo.services.BugTrackingService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/rest")
public class BugTrackingController {

	@Autowired
	private BugTrackingService service;

	@GetMapping(path = "/trackissues")
	public List<BugTrackingIssues> findAllIssues(@RequestParam(defaultValue = "0") int pagenum, 
			@RequestParam(defaultValue = "10") int pagesize) { 
		Pageable pageable = PageRequest.of(pagenum, pagesize); 
																
		return this.service.findAll(pageable);
	}


	@GetMapping(path = "/trackissues/{issueId}")
	public Optional<BugTrackingIssues> findyIssueById(@PathVariable("issueId") int id) {
		return this.service.findIssuesById(id);
	}

	@PostMapping(path = "/trackissues")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BugTrackingIssues postIssue(@RequestBody BugTrackingIssues trackIssue) {

		return this.service.saveIssue(trackIssue);
	}

}
