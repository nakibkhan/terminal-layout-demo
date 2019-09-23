package com.example.terminallayoutdemo.controller

import com.example.terminallayoutdemo.domain.Section
import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.service.SectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping(value = "/section")
class SectionController {
    @Autowired SectionService sectionService

    @PostMapping()
    Section addSection(@RequestBody Section section)  {
        sectionService.addSection(section)
    }

    @GetMapping()
    List<Section> getAll() {
        sectionService.getAll()
    }

    @GetMapping(value = "/id/{id}")
    Section findById(@PathVariable(value = "id") Long id)    {
        sectionService.findById(id)
    }
}
