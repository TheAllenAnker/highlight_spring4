package com.allenanker.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("Execute in every 5 secs " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "* * * 1,2,3 * *")
    public void fixTimeExecution() {
        System.out.println("Executed in specified time: " + dateFormat.format(new Date()));
    }
}
