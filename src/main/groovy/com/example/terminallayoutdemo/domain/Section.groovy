package com.example.terminallayoutdemo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long sectionId

    String description

//    List<Long> stepIds
}
