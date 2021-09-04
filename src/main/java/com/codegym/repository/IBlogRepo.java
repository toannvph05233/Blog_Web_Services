package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface IBlogRepo extends PagingAndSortingRepository<Blog,Long> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    Blog findByCategoryName(String name);

    @Query(value = "select b from Blog b where b.category.id = :id")
    List<Blog> findAllByCategoryId(@Param("id") long id);
}
