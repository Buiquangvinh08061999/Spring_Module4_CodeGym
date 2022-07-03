package com.cg.model;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    Map<String, String> treeWord = new TreeMap<>();

    public Dictionary() {

        treeWord.put("cat",   "meo");
        treeWord.put("dog",   "cho");
        treeWord.put("thank", "cam on");
        treeWord.put("letgo", "di choi");

    }

    public Map<String, String> getTranslate() {
        return treeWord;
    }




































}
