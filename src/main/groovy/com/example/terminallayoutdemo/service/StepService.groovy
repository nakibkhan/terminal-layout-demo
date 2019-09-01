package com.example.terminallayoutdemo.service

import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.repository.StepRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class StepService {
    @Autowired StepRepository stepRepository

    Step addStep(Step step)  {
        stepRepository.save(step)
    }

    List<Step> getAll() {
        stepRepository.findAll() as List
    }

    Step findById(Long id)  {
        stepRepository.findById(id) as Step
    }
}
