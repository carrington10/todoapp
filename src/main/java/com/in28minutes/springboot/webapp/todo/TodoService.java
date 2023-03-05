package com.in28minutes.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
// to do service class 
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 1;
    static {
        todos.add(new Todo(todosCount++, "lord", "Learn aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "lord", "Learn devops", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "lord","Learn Full stack", LocalDate.now().plusYears(1), false));
    }// end of static 

    public List<Todo> findByUsername(String username){
        return todos;
    }
    public void  addTodo(String username,String description, LocalDate  targetDate, boolean done){
        Todo todoNew = new Todo(todosCount++, username, description, targetDate, done);
        todos.add(todoNew);

    }// end of add todo
}// end of todo service 
