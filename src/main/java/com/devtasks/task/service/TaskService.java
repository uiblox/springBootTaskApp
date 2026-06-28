package com.devtasks.task.service;

import com.devtasks.task.domain.CreateTaskRequest;
import com.devtasks.task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

}
