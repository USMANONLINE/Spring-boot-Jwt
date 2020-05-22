package com.spring.jwt.task;

import org.springframework.data.repository.CrudRepository;
public interface TaskRepository extends CrudRepository<Task, Integer> {
    
}
