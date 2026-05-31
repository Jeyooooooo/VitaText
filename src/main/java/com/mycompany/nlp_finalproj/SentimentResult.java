package com.mycompany.nlp_finalproj;

public class SentimentResult {
    private String metric;
    private String score;

    public SentimentResult() {}

    public SentimentResult(String metric, String score) {
        this.metric = metric;
        this.score = score;
    }

    public String getMetric() { return metric; }
    public void setMetric(String metric) { this.metric = metric; }

    public String getScore() { return score; }
    public void setScore(String score) { this.score = score; }
}