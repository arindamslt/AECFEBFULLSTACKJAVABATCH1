package com.arindam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Job;
@Repository
public interface JobRepository extends JpaRepository<Job,String>{

}
