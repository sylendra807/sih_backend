package com.sih.railway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sih.railway.Service.ImageService;
import com.sih.railway.model.Images;

@RestController
public class Imagecontroller {
    @Autowired
    ImageService s;
    @PostMapping("/images")
    public Images addi(@RequestBody Images i)
    {
      System.out.println("Received: " + i);
       return s.add(i);
    }
    @GetMapping("/images")
    public List<Images> get()
    {
       return s.get();
    }
    @GetMapping("/{category}")
    public List<Images> getByCategory(@PathVariable String category) {
       return s.getByCategory(category);
    }
}
