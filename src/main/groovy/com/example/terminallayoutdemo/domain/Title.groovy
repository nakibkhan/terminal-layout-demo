package com.example.terminallayoutdemo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long titleId

    String description
}
