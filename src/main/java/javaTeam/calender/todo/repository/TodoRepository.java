package javaTeam.calender.todo.repository;

import javaTeam.calender.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {

}
