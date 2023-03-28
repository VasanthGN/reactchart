package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

@Repository
public interface DemoRepository extends JpaRepository<Users,Integer>{
	
	public Users findByName(String name);
	
	
	public List<Users> findByFollow(String name);
	
	
}
