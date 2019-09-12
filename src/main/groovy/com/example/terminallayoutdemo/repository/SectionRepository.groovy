package com.example.terminallayoutdemo.repository

import com.example.terminallayoutdemo.domain.Section
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SectionRepository extends CrudRepository<Section, Long>{

}