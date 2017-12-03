package com.poem;
import java.util.*;
import java.lang.*;

class LocativeAdverb extends Adverb {

    String[] locativeAdverbList = {"Up", "down", "around", "away", "southeast", "nearby",
            "Below", "between", "above", "behind", "through", "around", "below", "between", "above", "behind", "through", "around"};

    public String generateWord() {
        Random rand = new Random();
        int selectLocative = rand.nextInt(locativeAdverbList.length);
        String locativeAdverbWord = locativeAdverbList[selectLocative];
        return locativeAdverbWord;
    }
}


