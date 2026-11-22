package com.xenox.vyora_main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageStudioController {

    @GetMapping("/images")
    public String imageStudio() {
        return "image-studio";
    }
}