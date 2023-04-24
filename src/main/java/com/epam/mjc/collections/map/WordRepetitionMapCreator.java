package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();
        if (sentence.length() == 0)
            return res;
        String[] words = sentence
                .toLowerCase()
                .replaceAll("[,.]", "")
                .split(" ");

        for (String word : words) {
            if (res.containsKey(word))
                res.put(word, res.get(word) + 1);
            else
                res.put(word, 1);
        }
        return res;
    }
}
