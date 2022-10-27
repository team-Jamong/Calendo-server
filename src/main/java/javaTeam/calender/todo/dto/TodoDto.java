package javaTeam.calender.todo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TodoDto {
    private Integer todoSeq;
    private String whatToDo;
    private Date registerDate;

    public TodoDto(String whatToDo , Date registerDate) {
        todoSeq++;
        this.whatToDo = whatToDo;
        this.registerDate = registerDate;
    }
}
