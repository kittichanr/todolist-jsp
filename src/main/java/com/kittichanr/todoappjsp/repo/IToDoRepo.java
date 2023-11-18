package com.kittichanr.todoappjsp.repo;

import com.kittichanr.todoappjsp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {
}
