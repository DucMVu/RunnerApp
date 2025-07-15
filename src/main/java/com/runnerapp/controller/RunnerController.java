package com.runnerapp.controller;

import com.runnerapp.model.Distance;
import com.runnerapp.model.Pace;
import com.runnerapp.model.Runner;
import com.runnerapp.model.Group;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RunnerController {
    private final List<Runner> runners = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @GetMapping("/runners")
    public List<Runner> getRunners() {
        return runners;
    }

    @PostMapping("/runners")
    public Runner addRunner(@RequestBody Runner runner) {
        runner.setId(idGenerator.incrementAndGet());
        runners.add(runner);
        return runner;
    }

    @GetMapping("/groups")
    public List<Group> getGroups() {
        Map<String, List<Runner>> grouped = runners.stream().collect(
            Collectors.groupingBy(r -> r.getPace() + "-" + r.getDistance())
        );
        List<Group> groups = new ArrayList<>();
        for (Map.Entry<String, List<Runner>> entry : grouped.entrySet()) {
            String[] parts = entry.getKey().split("-");
            Pace pace = Pace.valueOf(parts[0]);
            Distance distance = Distance.valueOf(parts[1]);
            groups.add(new Group(pace, distance, entry.getValue()));
        }
        return groups;
    }
}
