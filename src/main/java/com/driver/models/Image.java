package com.driver.models;

import javax.persistence.*;


@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // chil wrt to blog
    @ManyToOne
    @JoinColumn
    private Blog blog;

    public Image() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimension;
    }

    public void setDimensions(String dimension) {
        this.dimension = dimension;
    }

    private String description;
    private String dimension;
}