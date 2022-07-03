package com.cg.controller;



import com.cg.model.Dictionary;
import com.cg.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DictionaryController {

        @RequestMapping("/result")
        public String translate(@RequestParam String english, Model model) {

            Dictionary dictionary = new Dictionary();
            Map<String, String> treeWord;
            treeWord = dictionary.getTranslate();

            String res = "";
            if (treeWord.get(english) != null) {
                res = treeWord.get(english);
            } else {
                return  "Khong co trong tu dien tim kiem";

            }

            model.addAttribute("res" , res);

            return "result";
        }
    }

