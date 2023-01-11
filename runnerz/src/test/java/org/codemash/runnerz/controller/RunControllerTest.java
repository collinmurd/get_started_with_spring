package org.codemash.runnerz.controller;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.codemash.runnerz.model.Location;
import org.codemash.runnerz.model.Run;
import org.codemash.runnerz.service.RunService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class RunControllerTest {

    RunController controller;

    @MockBean
    RunService service;

    private List<Run> runs = new ArrayList<Run>();

    @BeforeEach
    void setUp() {
        controller = new RunController(service);
        runs.add(new Run(1,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR));
    }

    @Test
    void shouldFinalAllRuns() {
        Mockito.when(service.findAll()).thenReturn(runs);
        Assertions.assertEquals(1,controller.findAll().size());
    }
}
