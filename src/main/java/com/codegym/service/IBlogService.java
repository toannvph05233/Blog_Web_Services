package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface IBlogService {
    public Page<Blog> findAll(Pageable pageable);

    public ArrayList<Blog> findAllByCategoryId(long id);

    public Blog findById(long id);

    public Blog save(Blog blog);

    public void remove(long id);

    public Page<Blog> findAllByTitle(String title,Pageable pageable);


}
