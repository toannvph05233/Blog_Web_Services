package com.codegym.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    // fetch = FetchType.LAZY tránh sự lặp vô hạn khi lấy dữ liệu.
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Blog> list;

    public Category() {
    }

    public Category(long id, String name, Set<Blog> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    public Set<Blog> getList() {
        return list;
    }

    public void setList(Set<Blog> list) {
        this.list = list;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
