package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserEntry;

public interface UserEntryRepository extends JpaRepository<UserEntry, Integer> {

}
