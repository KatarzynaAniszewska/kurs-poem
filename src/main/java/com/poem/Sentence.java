package com.poem;
import java.util.*;
import java.lang.*;
class Sentence {
    String subject;
    String predicate;
    String adverb;

    public Sentence(String subject, String predicate, String adverb) {
        this.subject = subject;
        this.predicate = predicate;
        this.adverb = adverb;
    }
    public String toString(){
        return subject+" "+" "+predicate+" "+adverb;
    }

}
