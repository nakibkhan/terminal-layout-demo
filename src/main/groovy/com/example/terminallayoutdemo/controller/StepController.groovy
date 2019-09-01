package com.example.terminallayoutdemo.controller

import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.service.StepService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping(value = "/step")
class StepController {
    @Autowired StepService stepService

    @PostMapping()
    Step addStep(@RequestBody Step step)  {
        stepService.addStep(step)
    }

    @GetMapping()
    List<Step> getAll() {
        stepService.getAll()
    }

    @GetMapping(value = "/id/{value}")
    Step findById(@PathVariable(value = "value") Long id)    {
        stepService.findById(id)
    }
}
