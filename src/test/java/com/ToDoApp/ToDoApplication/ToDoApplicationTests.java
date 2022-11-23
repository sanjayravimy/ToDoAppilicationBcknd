package com.ToDoApp.ToDoApplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SpringBootTest
class ToDoListTest {

	@InjectMocks
	ToDoList toDoList;
	@Test
	void toDoTaskTest() {
		Map<String, List<String>> returnedMap = toDoList.toDoTask();
		List<String> toDoList = new ArrayList<>();
		toDoList.add("WorkOut");
		toDoList.add("Exercise");
		List<String> inProgressList = new ArrayList<>();
		inProgressList.add("Working");
		inProgressList.add("CurrentTask");
		List<String> doneTask = new ArrayList<>();
		doneTask.add("BreakFast");
		Map<String, List<String>> ExpectedMap = new HashMap<>();
		ExpectedMap.put("ToDo", toDoList);
		ExpectedMap.put("InProgress", inProgressList);
		ExpectedMap.put("Done", doneTask);
		Assertions.assertEquals(returnedMap,returnedMap);
	}

}