package com.poem;
import java.util.*;
import java.lang.*;

class Subject extends SentencePart {

    String[] subjectList = {"Flower", "Chair", "Sky", "Car", "Clauds", "Women", "Horse", "Dog", "Table", "Pencil", "Book"};

    @Override
    public String generateWord() {

        Random rand = new Random();
        int selectSubject = rand.nextInt(subjectList.length);
        String subjectWord = subjectList[selectSubject];
        return subjectWord;
    }
}
