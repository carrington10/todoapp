package com.in28minutes.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.List;
// to do service class 
public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1, "lord", "Learn aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "lord", "Learn devops", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "lord","Learn Full stack", LocalDate.now().plusYears(1), false));
    }// end of static 

    public List<Todo> findByUsername(String username){
        return todos;
    }
}// end of todo service 
