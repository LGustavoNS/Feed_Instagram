package com.example.cardview.model;

public class Postings {

    private String name;
    private String postings;
    private int image;

    public Postings() {
    }

    public Postings(String name, String postings, int image) {
        this.name = name;
        this.postings = postings;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostings() {
        return postings;
    }

    public void setPostings(String postings) {
        this.postings = postings;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
