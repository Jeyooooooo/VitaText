package com.mycompany.nlp_finalproj;

public class LemmaRecord {
    private String id;
    private String originalWord;
    private String posTag;
    private String lemma;

    public LemmaRecord(String id, String originalWord, String posTag, String lemma) {
        this.id = id;
        this.originalWord = originalWord;
        this.posTag = posTag;
        this.lemma = lemma;
    }

    public String getId() { return id; }
    public String getOriginalWord() { return originalWord; }
    public String getPosTag() { return posTag; }
    public String getLemma() { return lemma; }
}