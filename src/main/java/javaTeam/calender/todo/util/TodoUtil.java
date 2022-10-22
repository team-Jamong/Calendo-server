package javaTeam.calender.todo.util;

import javaTeam.calender.todo.entity.Todo;
import javaTeam.calender.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
@RequiredArgsConstructor
public class TodoUtil {

    public Todo todoWriteUtil(Integer todoSeqDto, String whatToDoDto, Date registerDateDto) {

        Todo registerTodo = new Todo(0, null , null);

        registerTodo.builder()
                .todoSeq(todoSeqDto)
                .whatToDo(whatToDoDto)
                .registerDate(registerDateDto)
                .build();

        return registerTodo;
    }
}
