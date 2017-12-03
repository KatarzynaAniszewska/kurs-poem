package com.poem;
import java.util.*;
import java.lang.*;

class Predicate extends SentencePart {

    String[] predicateList = {"give", "make", "saw", "wrote", "think", "run", "play", "loves", "hates", "generate", "shoot",
            "shout", "dance", "leaved", "learned"};

    @Override
    public String generateWord() {

        Random rand = new Random();
        int selectPredicate = rand.nextInt(predicateList.length);
        String predicateWord = predicateList[selectPredicate];
        return predicateWord;

    }

}