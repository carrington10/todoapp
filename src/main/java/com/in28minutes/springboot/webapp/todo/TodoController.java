package com.in28minutes.springboot.webapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value="add-todo",method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap map){
        String username = (String)map.get("name");
        Todo todo = new Todo(0,username,"test",LocalDate.now().plusYears(1),false);
        map.put("todo",todo);
        return "todo";
    }// end of list all todos

    @RequestMapping(value="add-todo",method = RequestMethod.POST)
    public String addNewTodo(ModelMap map, Todo todo){
        String username = (String)map.get("name");
       tService.addTodo(username,todo.getDescription(),LocalDate.now().plusYears(1),false);

       return "redirect:list-todos";
    }// end of list all todos
}
