package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BugTrackingIssues;
import com.example.demo.repository.BugTrackingRepository;

@Service
public class BugTrackingService {
	
	@Autowired
	private BugTrackingRepository repository;
	
	public List<BugTrackingIssues> findAll(Pageable pageable){
		
		Page<BugTrackingIssues> pages=this.repository.findAll(pageable);
		
		return pages.getContent();
	}
	
	public Optional<BugTrackingIssues> findIssuesById(int id){
		
		return this.repository.findById(id);
	}
	
	public BugTrackingIssues saveIssue(BugTrackingIssues trackIssue) {
		
		return this.repository.save(trackIssue);
	}

}
