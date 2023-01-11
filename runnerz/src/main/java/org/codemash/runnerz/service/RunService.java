package org.codemash.runnerz.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.codemash.runnerz.model.Location;
import org.codemash.runnerz.model.Run;
import org.springframework.stereotype.Service;

@Service
public class RunService {

    private final AtomicInteger id = new AtomicInteger(1);

    private final List<Run> runs = new ArrayList<Run>();

    public RunService() {
        runs.add(new Run(id.getAndIncrement(),
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR));
    }

    public List<Run> findAll() {
        return runs;
    }

    public Run create(Run run) {
        Run newRun = new Run(id.getAndIncrement(),
                run.title(),
                run.startedOn(),
                run.completedOn(),
                run.miles(),
                run.location());

        runs.add(newRun);
        return newRun;
    }
}
