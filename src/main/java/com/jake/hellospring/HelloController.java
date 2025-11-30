package com.jake.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/") //homepage
public String greeting(Model model){

        String name = "Jake";
        model.addAttribute("name", name);
        model.addAttribute("className", "Java");
        model.addAttribute("classCode", 2545);

    return "hello";
}

@GetMapping("/about")
    public String about(){
        return "about";
}

}
