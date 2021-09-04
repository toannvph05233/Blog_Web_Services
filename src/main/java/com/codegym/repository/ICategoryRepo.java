package com.codegym.repository;

import com.codegym.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICategoryRepo extends CrudRepository<Category,Long> {
}
