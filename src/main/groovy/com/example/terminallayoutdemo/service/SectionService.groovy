package com.example.terminallayoutdemo.service

import com.example.terminallayoutdemo.domain.Section
import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.domain.StepStatus
import com.example.terminallayoutdemo.repository.SectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SectionService {
    @Autowired SectionRepository sectionRepository


    Section addSection(Section section)  {
        sectionRepository.save(section)
    }

    List<Section> getAll() {
        sectionRepository.findAll() as List
    }

    Section findById(Long id)  {
        sectionRepository.findById(id).get()
    }
}
