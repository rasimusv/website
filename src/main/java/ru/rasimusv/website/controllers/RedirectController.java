package ru.rasimusv.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RedirectController {

    @GetMapping(value = "/anatolik2021")
    public String doRedirect() {
        return "redirect:http://youtu.be/lm_3Zh28NKs";
    }

}
