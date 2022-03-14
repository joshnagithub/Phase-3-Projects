package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}

