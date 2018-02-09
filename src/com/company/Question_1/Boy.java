package com.company.Question_1;

public class Boy extends Main {
    public Boy(String dislikes, String likes) {
        super(dislikes, likes);
        this.dislikes = dislikes;
        this.likes = likes;
    }

    private String dislikes;
    private String likes;

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}