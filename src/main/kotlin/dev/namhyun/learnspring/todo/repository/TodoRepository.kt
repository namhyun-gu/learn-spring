package dev.namhyun.learnspring.todo.repository

import dev.namhyun.learnspring.todo.model.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Int> {}