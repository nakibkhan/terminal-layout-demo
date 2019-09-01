package com.example.terminallayoutdemo.repository

import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.domain.StepStatus
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StepRepository extends CrudRepository<Step, Long> {
    List<Step> findByStatus(StepStatus status)
}
