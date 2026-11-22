package com.xenox.vyora_main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StorageController {

    @GetMapping("/storage")
    public String storage() {
        return "storage";
    }
}