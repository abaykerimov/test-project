package com.example.test.domain;

public class Text {

    private Long id;
    private String text;

    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

    public Text(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
