package br.com.julioceno.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository; 

    @PostMapping("/")
    public TaskModel createTask(@RequestBody TaskModel taskModel) {

        System.out.print(taskModel.getDescription());

        var taskCreated = this.taskRepository.save(taskModel);
        return taskCreated;
    }
}