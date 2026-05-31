package com.mycompany.nlp_finalproj;

public class PosRecord {
    private String id;
    private String word;
    private String tag;
    private String description;

    public PosRecord() {}

    public PosRecord(String id, String word, String tag, String description) {
        this.id = id;
        this.word = word;
        this.tag = tag;
        this.description = description;
    }

    public String getId() { return id; }
    public String getWord() { return word; }
    public String getTag() { return tag; }
    public String getDescription() { return description; }
}