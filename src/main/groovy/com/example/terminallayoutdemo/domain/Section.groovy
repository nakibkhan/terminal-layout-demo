package com.example.terminallayoutdemo.domain

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

@Entity
class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long sectionId

    String title
}
