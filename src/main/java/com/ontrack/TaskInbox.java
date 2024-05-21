// src/main/java/com/ontrack/TaskInbox.java
package com.ontrack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskInbox {
    private static Map<String, List<String>> taskData;
    private static Map<String, Map<String, Object>> taskDetailsData;

    static {
        taskData = new HashMap<>();
        taskData.put("12345", List.of("Task1", "Task2", "Task3"));

        taskDetailsData = new HashMap<>();
        Map<String, Object> task1Details = new HashMap<>();
        task1Details.put("feedbackStatus", "Reviewed");
        task1Details.put("messages", List.of("Message1", "Message2"));
        taskDetailsData.put("Task1", task1Details);
    }

    public List<String> getTaskInbox(String studentId) {
        return taskData.getOrDefault(studentId, List.of());
    }

    public Map<String, Object> viewTaskDetails(String taskId) {
        return taskDetailsData.getOrDefault(taskId, Map.of());
    }
}
