package com.chinese.bean;


public class Author {
    private String id;
    private String author_name;
    private String author_dynasty;
    private String author_intro;
    private String author_pic;

    public String getId() {
        return id;
    }

    public String getAuthor_dynasty() {
        return author_dynasty;
    }

    public void setAuthor_dynasty(String author_dynasty) {
        this.author_dynasty = author_dynasty;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getAuthor_pic() {
        return author_pic;
    }

    public void setAuthor_pic(String author_pic) {
        this.author_pic = author_pic;
    }
}

