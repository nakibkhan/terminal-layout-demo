package com.example.terminallayoutdemo.service

import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.domain.StepStatus
import com.example.terminallayoutdemo.repository.StepRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class StepService {
    @Autowired StepRepository stepRepository

    Step addStep(Step step)  {
        step.status = StepStatus.NEW
        stepRepository.save(step)
    }

    Step approveStep(Long id)   {
        Step step = stepRepository.findById(id).get()
        step.status = StepStatus.APPROVED
        stepRepository.save(step)
    }

    List<Step> getAll() {
        stepRepository.findAll() as List
    }

    Step findById(Long id)  {
        stepRepository.findById(id).get()
    }

    List<Step> findAllApproved()    {
        stepRepository.findByStatus(StepStatus.APPROVED)
    }
}
