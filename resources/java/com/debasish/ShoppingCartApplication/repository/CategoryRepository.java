package com.debasish.ShoppingCartApplication.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debasish.ShoppingCartApplication.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Boolean existsByName(String name);

	public List<Category> findByIsActiveTrue();

}
