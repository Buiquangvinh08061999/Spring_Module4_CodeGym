package com.cg.service;


import java.util.LinkedHashMap;
import java.util.Map;

public class DictionaryService implements IDictionaryService{
      static  Map<String, String> dictionaryMap = new LinkedHashMap<>();

      static {
          dictionaryMap.put("xin chao", "hello");
          dictionaryMap.put("xin loi", "sorry");
          dictionaryMap.put("di choi", "letgo");
          dictionaryMap.put("cam on", "thank");
      }

    @Override
    public String search(String input) {
        if(dictionaryMap.get(input) != null){
            return dictionaryMap.get(input);
        }else {
            return "Không tìm thấy từ này";
        }


    }
}
