package com.example.msgadmin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {

    @GetMapping("/board")
    @ResponseBody
    public String Board() {
        return "webHook Test2";
    }

    @GetMapping("/boardSearch")
    public String Search(@RequestParam("name") String name) {
        return "hi2";
    }

    @GetMapping("/start")
    public String Main(@RequestParam("Nickname") String nickname) {
        String changeName = "My name is : " + nickname;
        return changeName;
    }

    @GetMapping("pigApi")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;
        private String test;

        public String getName() {
            return test + name;
        }

        public void setName(String name) {
            this.name = name;
            this.test = "test";
        }
    }
}
