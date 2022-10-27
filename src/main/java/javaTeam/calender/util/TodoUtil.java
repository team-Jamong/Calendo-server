package javaTeam.calender.util;

import javaTeam.calender.entity.Todo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
