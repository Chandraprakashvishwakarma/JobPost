package com.MongoTest.repository;

import com.MongoTest.Model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
