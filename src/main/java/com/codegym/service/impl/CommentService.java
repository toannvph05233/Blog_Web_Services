package com.codegym.service.impl;

import com.codegym.model.Comment;
import com.codegym.repository.ICommentRepo;
import com.codegym.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    @Override
    public List<Comment> findAllByBlogId(long id) {
        return iCommentRepo.findAllByBlogId(id);
    }
}
