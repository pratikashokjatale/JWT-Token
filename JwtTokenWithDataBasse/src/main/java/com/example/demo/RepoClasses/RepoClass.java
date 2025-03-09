package com.example.demo.RepoClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employ;

@Repository
public interface RepoClass extends JpaRepository<Employ, Integer> {

}
