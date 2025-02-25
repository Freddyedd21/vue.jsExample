package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(Object title, Object description, boolean b) {
        this.title = title.toString();
        this.description = description.toString();
        this.published = b;

    }

    public Object getDescription() {
        return description;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title.toString();

    }

    public void setDescription(Object description) {
        this.description = description.toString();
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isPublished() {
        return published;
    }
}
