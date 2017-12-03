package com.poem;
import java.util.*;
import java.lang.*;
class TemporalAdverb extends Adverb {

    String[] temporalAdverbList = {"now", "then", "today", "tomorrow", "tonight", "yesterday", "annually",
            "daily", "fortnightly", "hourly", "monthly", "nightly", "quarterly", "weekly", "yearly"};
    public String generateWord() {
        Random rand = new Random();
        int selectTamporal = rand.nextInt(temporalAdverbList.length);
        String temporalAdverbWord = temporalAdverbList[selectTamporal];
        return temporalAdverbWord;}
}
