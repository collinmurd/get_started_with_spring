package org.codemash.runnerz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    private static final String template = "Hello %s";

    @GetMapping
    public String hello(@RequestParam(value="name", defaultValue="CodeMash") String name) {
        return String.format(template, name);
    }
}
