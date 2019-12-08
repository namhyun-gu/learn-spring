package dev.namhyun.learnspring.todo

import dev.namhyun.learnspring.todo.model.Todo
import dev.namhyun.learnspring.todo.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController {

    @Autowired
    private lateinit var repository: TodoRepository

    @PostMapping
    fun add(@RequestParam title: String?, @RequestParam content: String?): ResponseEntity<Todo> {
        return if (title != null) {
            val todo = Todo(null, title, content)
            repository.save(todo)
            ResponseEntity.ok(todo)
        } else {
            ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }

    @GetMapping
    fun findAll(): List<Todo> = repository.findAll()

    @PutMapping
    fun update(@RequestParam id: Int?, @RequestParam title: String?, @RequestParam content: String?): ResponseEntity<Todo> {
        return if (id != null) {
            val todo = repository.getOne(id)
            if (title != null) {
                todo.title = title
            }
            if (content != null) {
                todo.content = content
            }
            repository.save(todo)
            ResponseEntity.ok(todo)
        } else {
            ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }

    @DeleteMapping
    fun delete(@RequestParam id: Int): ResponseEntity<Int> {
        repository.deleteById(id)
        return ResponseEntity.ok(id)
    }
}