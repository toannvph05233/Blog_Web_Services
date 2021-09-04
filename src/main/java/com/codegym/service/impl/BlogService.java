package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepo;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepo iBlogRepo;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepo.findAll(pageable);
    }

    @Override
    public ArrayList<Blog> findAllByCategoryId(long id) {
        return (ArrayList<Blog>) iBlogRepo.findAllByCategoryId(id);
    }

    @Override
    public Blog findById(long id) {
        return iBlogRepo.findById(id).get();
    }

    @Override
    public Blog save(Blog blog) {
        return iBlogRepo.save(blog);
    }

    @Override
    public void remove(long id) {
        iBlogRepo.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByTitle(String title, Pageable pageable) {
        return iBlogRepo.findAllByTitleContaining(title,pageable);
    }
}
