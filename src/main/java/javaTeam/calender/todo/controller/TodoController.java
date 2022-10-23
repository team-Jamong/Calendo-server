package javaTeam.calender.todo.controller;

import javaTeam.calender.todo.dto.TodoDto;
import javaTeam.calender.todo.service.TodoService;
import javaTeam.calender.todo.service.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class TodoController {

    TodoService todoService = new TodoServiceImpl();

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/todo")
    public String todo(Model model) {

        return "todolist";
    }

    @GetMapping("/todo/write")
    public String writeTodoTemplate() {
        return "write-todo";
    }

    @PostMapping("/todo/write")
    public String writeTodo(
            @RequestParam String whatToDo,
            @RequestParam Date registerDate){

        TodoDto todoDto = new TodoDto(whatToDo, registerDate);
        todoService.write(todoDto);

        return "todolist";
    }
}
