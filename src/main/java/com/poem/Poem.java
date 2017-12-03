package com.poem;
import java.util.*;
import java.lang.*;
class Poem {
    public static void main(String[] args) {
        ArrayList<Sentence> poem = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Subject subject = new Subject();
            String subjectWord = subject.generateWord();

            Predicate predicate = new Predicate();
            String predicateWord = predicate.generateWord();

            LocativeAdverb locativeAdverb = new LocativeAdverb();
            String locativeTosentence = locativeAdverb.generateWord();

            TemporalAdverb temporalAdverb = new TemporalAdverb();
            String temporalTosentence = temporalAdverb.generateWord();

            MannerAdverb mannerAdverb = new MannerAdverb();
            String mannerToSentence = mannerAdverb.generateWord();

            String[] adverbList = {locativeTosentence, temporalTosentence, mannerToSentence};
            Random rand = new Random();
            int selectAdverb = rand.nextInt(adverbList.length);
            String adverbWord = adverbList[selectAdverb];
            Sentence sentence = new Sentence(subjectWord, predicateWord, adverbWord);

            System.out.println(sentence);
        }


    }
}
