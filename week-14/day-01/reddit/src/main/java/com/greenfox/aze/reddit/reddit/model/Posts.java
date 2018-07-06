package com.greenfox.aze.reddit.reddit.model;

import sun.util.resources.Bundles;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private int score;
    private Long timestamp = new Date().getTime();


    public Posts(String title, String url) {
        this.title = title;
        this.url = url;
        this.score = 0;
    }

    public Posts() {
    }

    public Long getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
