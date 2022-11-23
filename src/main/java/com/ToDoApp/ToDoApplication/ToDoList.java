package com.ToDoApp.ToDoApplication;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

@RestController

public class ToDoList {

    @CrossOrigin("http://localhost:5000/")
    @GetMapping("/toDoList")

    public  Map<String, List<String>> toDoTask(){
        List<String> toDoList = new ArrayList<>();
        toDoList.add("WorkOut");
        toDoList.add("Running");
        toDoList.add("Exercise");
        toDoList.add("Exercise2");
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("Working");
        inProgressList.add("CurrentTask");
        List<String> doneTask = new ArrayList<>();
        doneTask.add("BreakFast");
        return new HashMap<String, List<String>>(){{
            put("ToDo", toDoList);
            put("InProgress", inProgressList);
            put("Done", doneTask);
        }};

    }

    public void SOMETHING(){
        while(true){
            System.out.println("Hello");
        }
    }
}
