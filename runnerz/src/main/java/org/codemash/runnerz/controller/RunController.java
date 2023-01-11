package org.codemash.runnerz.controller;

import java.util.List;

import org.codemash.runnerz.model.Run;
import org.codemash.runnerz.service.RunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunService runService;

    // @Autowire - spring will see an existing instance of RunService, then wire that in
    public RunController(RunService runService) {
        this.runService = runService;
    }

    @PostMapping
    public Integer create(@RequestBody Run input) {
        return(runService.create(input).id());
    }

    @GetMapping
    public List<Run> findAll() {
        return runService.findAll();
    }
}
