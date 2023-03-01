package com.in28minutes.springboot.webapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
    // list todos

    private TodoService tService;


    public TodoController(TodoService service) {
        super();
        this.tService = service;
    }
    
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> list = tService.findByUsername("lord");
        model.addAttribute("todos",list);
       return "listTodos";
    }// end of list all todos
}
