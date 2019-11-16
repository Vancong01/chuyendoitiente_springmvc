package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class currency_conversion {
    @RequestMapping("/conversion")
    public String conversion(Model model){
        return "form";
    }
    @RequestMapping(value ="result")
    public String result(@RequestParam("usd") float usd,Model model){
        float result = conversion(usd);
        model.addAttribute("result", result);
        return "/result";
    }
    public float conversion(Float usd){
        return usd * 23000;
    }
}
