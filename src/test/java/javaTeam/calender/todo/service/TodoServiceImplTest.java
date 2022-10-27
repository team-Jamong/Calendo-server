package javaTeam.calender.todo.service;

import javaTeam.calender.todo.dto.TodoDto;
import javaTeam.calender.entity.Todo;
import javaTeam.calender.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
@Slf4j
class TodoServiceImplTest {

    TodoService todoService = new TodoServiceImpl();
    TodoRepository todoRepository;
    @Test
    void write() {
        TodoDto todoDto = new TodoDto("todo", new Date());

        todoService.write(todoDto);
        Optional<Todo> findWrite = todoRepository.findById(1);

        Assertions.assertThat(findWrite).isEqualTo("todo");
    }
}