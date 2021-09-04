package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Comment;

import java.util.List;

public interface ICommentService {
    public List<Comment> findAllByBlogId(long id);
}
