package com.example.terminallayoutdemo.domain

import org.hibernate.annotations.GeneratorType

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long stepId

    String description
    StepStatus status
}
