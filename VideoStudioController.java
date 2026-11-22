package com.xenox.vyora_main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoStudioController {

    @GetMapping("/videos")
    public String videoStudio() {
        return "video-studio";
    }
}