package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Category;

public interface CategoryRespository extends JpaRepository<Category,Integer> {

}
