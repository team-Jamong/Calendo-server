package javaTeam.calender.todo.service;

import javaTeam.calender.todo.dto.TodoDto;
import javaTeam.calender.todo.entity.Todo;
import javaTeam.calender.todo.repository.TodoRepository;
import javaTeam.calender.todo.util.TodoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class TodoServiceImpl implements TodoService{

    @Autowired
    TodoRepository todoRepository;

    TodoUtil todoUtil = new TodoUtil();

    @Override
    public void write(TodoDto todoDto) {
        Integer todoSeqParm = todoDto.getTodoSeq();
        String whatTodoParm = todoDto.getWhatToDo();
        Date registerDateParm = todoDto.getRegisterDate();

        Todo todo = todoUtil.todoWriteUtil(todoSeqParm, whatTodoParm, registerDateParm);
        todoRepository.save(todo);
    }
}
