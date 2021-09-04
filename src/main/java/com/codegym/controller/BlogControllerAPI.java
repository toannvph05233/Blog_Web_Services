package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Comment;
import com.codegym.service.IBlogService;
import com.codegym.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@CrossOrigin("*")
public class BlogControllerAPI {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICommentService commentService;

    @GetMapping
    public ResponseEntity<Page<Blog>> blogs(@RequestParam(defaultValue = "0") int page) {
        return new ResponseEntity<>(blogService.findAll(PageRequest.of(page, 2)), HttpStatus.OK);
    }

    @GetMapping("/categoryId/{id}")
    public ResponseEntity<ArrayList<Blog>> findAllBlogByCategoryId(@PathVariable long id) {
        return new ResponseEntity<>(blogService.findAllByCategoryId(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> findById(@PathVariable long id) {
        return new ResponseEntity<>(blogService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/comments/{idBlog}")
    public ResponseEntity<List<Comment>> findCommentByBlogId(@PathVariable long idBlog) {
        return new ResponseEntity<>(commentService.findAllByBlogId(idBlog), HttpStatus.OK);
    }


}
