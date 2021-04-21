package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface userrepository extends JpaRepository <User , Long>{
	

}
