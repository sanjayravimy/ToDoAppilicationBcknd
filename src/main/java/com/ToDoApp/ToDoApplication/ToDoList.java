package com.ToDoApp.ToDoApplication;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController

public class ToDoList {
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoList.class);

    @CrossOrigin("https://todoappng-patient-quokka-sz.cfapps.us10-001.hana.ondemand.com")
    @GetMapping("/toDoList")

    public  Map<String, List<String>> toDoTask(){
        LOGGER.info("Info log from api");
        List<String> toDoList = new ArrayList<>();
        toDoList.add("NOthing to do");
        toDoList.add("Running");
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Working");
        inProgressList.add("CurrentTask");
        List<String> doneTask = new ArrayList<>();
        doneTask.add("BreakFast");
        LOGGER.error("Error log from api");
        return new HashMap<String, List<String>>(){{
            put("ToDo", toDoList); 
            put("InProgress", inProgressList);
            put("Done", doneTask);
        }};

    }
}
