package javaTeam.calender.todo.service;

import javaTeam.calender.todo.dto.TodoDto;
import javaTeam.calender.entity.Todo;

import java.util.List;

public interface TodoService {
    void write(TodoDto todoDto); // 플래너 작성
    List<Todo> findAllTodoList(); // 전체 플래너
}
