package com.poem;
import java.util.*;
import java.lang.*;

class MannerAdverb extends Adverb {

    String[] mannerAdverbList = {"sleepily", "truthfully", "greedily", "suspiciously", "generously", "recklessly",
            "repeatedly", "brightly", "generously", "recklessly", "repeatedly", "brightly", "healthily", "gently",
            "lazily", "successfully"};
    public String generateWord() {
        Random rand = new Random();
        int selectManner = rand.nextInt(mannerAdverbList.length);
        String mannerAdverbWord = mannerAdverbList[selectManner];
        return mannerAdverbWord;}

}

