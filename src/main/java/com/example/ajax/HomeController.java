package com.example.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private int count1 = 0;
    private int count2 = 0;

    @GetMapping("/main1")
    public String showMain1(Model model) {
        count1++;
        count2++;

        model.addAttribute("count1", count1);
        model.addAttribute("count2", count2);

        return "main1";
    }
}