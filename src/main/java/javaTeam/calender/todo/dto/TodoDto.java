package javaTeam.calender.todo.dto;

import javaTeam.calender.todo.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TodoDto {
    private Integer todoSeq;
    private String WhatToDo;
    private Date registerDate;

    public TodoDto(Todo todo) {
        this.todoSeq = todo.getTodoSeq();
        this.WhatToDo = todo.getWhatToDo();
        this.registerDate = todo.getRegisterDate();
    }
}
