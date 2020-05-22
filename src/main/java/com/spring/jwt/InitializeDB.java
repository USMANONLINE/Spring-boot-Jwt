package com.spring.jwt;

import com.spring.jwt.task.Task;
import com.spring.jwt.task.TaskRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeDB implements CommandLineRunner {
    @Autowired
    private TaskRepository taskRepository;
    
    @Override
    public void run(String... strings) throws Exception {
        List<Task> tasks = Arrays.asList(
                new Task("I have this awesome startup idea"),
                new Task("I believe this idea is going to make the world a better place"),
                new Task("I am not sure how the market with joke with me initially"),
                new Task("I need some serious money to get started"),
                new Task("I don't think i need to spend serious time deciding the technology to use"),
                new Task("Lets get it started and live"),
                new Task("So help me GOD !")
        );
        taskRepository.saveAll(tasks);
    }
}
