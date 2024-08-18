package com.sih.railway.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sih.railway.model.Images;
import java.util.*;

@Repository
public interface Imagerepo extends MongoRepository<Images,Integer> {
    public List<Images> findByCategory(String a);
    
} 
