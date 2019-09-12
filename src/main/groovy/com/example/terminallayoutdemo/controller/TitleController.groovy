package com.example.terminallayoutdemo.controller

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class TitleController {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long titleId

    String description
}
