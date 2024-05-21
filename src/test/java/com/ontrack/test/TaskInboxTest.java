// src/test/java/com/ontrack/test/TaskInboxTest.java
package com.ontrack.test;

import com.ontrack.TaskInbox;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

public class TaskInboxTest {

    @Test
    public void testGetTaskInbox() {
        TaskInbox taskInbox = new TaskInbox();
        List<String> expectedTasks = List.of("Task1", "Task2", "Task3");
        assertEquals(expectedTasks, taskInbox.getTaskInbox("12345"));
    }

    @Test
    public void testViewTaskDetails() {
        TaskInbox taskInbox = new TaskInbox();
        Map<String, Object> expectedDetails = Map.of(
                "feedbackStatus", "Reviewed",
                "messages", List.of("Message1", "Message2")
        );
        assertEquals(expectedDetails, taskInbox.viewTaskDetails("Task1"));
    }
}
