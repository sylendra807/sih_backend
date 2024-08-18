package com.sih.railway.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sih.railway.model.Images;
import com.sih.railway.repository.Imagerepo;

@Service
public class ImageService {
    @Autowired
    Imagerepo r;
    public List<Images> get()
    {
        return r.findAll();
    }
    public Images add(Images i)
    {
        return r.save(i);
    }
    public List<Images> getByCategory(String category) {
        return r.findByCategory(category);
    }
}
