package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {

    public  static AtomicLong lastId = new AtomicLong();
    private long id;
    private String content;

    public Greetings(String content) {
        this.id = lastId.incrementAndGet();
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
