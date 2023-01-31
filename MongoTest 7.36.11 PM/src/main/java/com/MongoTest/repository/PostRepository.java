package com.MongoTest.repository;

import com.MongoTest.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
