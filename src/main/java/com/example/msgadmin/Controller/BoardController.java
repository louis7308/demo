package com.example.msgadmin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/board")
    public String Board() {
        return "webHook Test";
    }
}
