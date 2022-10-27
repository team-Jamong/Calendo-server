package javaTeam.calender.todo.service;

import javaTeam.calender.todo.dto.TodoDto;
import javaTeam.calender.entity.Todo;
import javaTeam.calender.todo.repository.TodoRepository;
import javaTeam.calender.util.TodoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TodoServiceImpl implements TodoService{

    @Autowired
    TodoRepository todoRepository;

    TodoUtil todoUtil = new TodoUtil();

    @Override
    public void write(TodoDto todoDto) {
        Todo todo = todoUtil.todoWriteUtil(todoDto.getTodoSeq(), todoDto.getWhatToDo(), todoDto.getRegisterDate());
        todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAllTodoList() {
        List<Todo> todos = todoRepository.findAll();

        return todos;
    }
}
