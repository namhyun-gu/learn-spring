package dev.namhyun.learnspring.todo.model

import dev.namhyun.learnspring.util.BaseTimeEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Todo(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?, var title: String, var content: String?) : BaseTimeEntity()