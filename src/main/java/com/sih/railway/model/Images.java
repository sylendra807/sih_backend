package com.sih.railway.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "new")
public class Images {
     @Id
    String id;
    public Images() {
    }
    String category;
    String url;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
   
}
