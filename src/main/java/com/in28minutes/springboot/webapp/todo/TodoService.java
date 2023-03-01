package com.in28minutes.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
// to do service class 
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "lord", "Learn aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "lord", "Learn devops", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "lord","Learn Full stack", LocalDate.now().plusYears(1), false));
    }// end of static 

    public List<Todo> findByUsername(String username){
        return todos;
    }
}// end of todo service 
