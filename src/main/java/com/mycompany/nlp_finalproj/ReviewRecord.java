package com.mycompany.nlp_finalproj;

public class ReviewRecord {
    private String reviewText;
    private int rating;

    public ReviewRecord(String reviewText, int rating) {
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public String getReviewText() { return reviewText; }
    public int getRating() { return rating; }
}