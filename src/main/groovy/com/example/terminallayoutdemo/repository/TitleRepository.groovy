package com.example.terminallayoutdemo.repository

import com.example.terminallayoutdemo.domain.Title
import org.springframework.data.repository.CrudRepository

interface TitleRepository extends CrudRepository<Title, Long>{
}
