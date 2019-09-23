package com.example.terminallayoutdemo.service

import com.example.terminallayoutdemo.domain.Section
import com.example.terminallayoutdemo.domain.SectionDTO
import com.example.terminallayoutdemo.domain.Step
import com.example.terminallayoutdemo.repository.SectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SectionService {
    @Autowired SectionRepository sectionRepository
    @Autowired StepService stepService

    SectionDTO addSection(Section section)  {
        convertSectionToDTO(sectionRepository.save(section))
    }

    List<SectionDTO> getAll() {
        List<Section> list = sectionRepository.findAll() as List
        list.collect{
            convertSectionToDTO(it)
        }
    }

    SectionDTO findById(Long id)  {
        convertSectionToDTO(sectionRepository.findById(id).get())
    }

    List<Step> getStepsForSection(Section section)  {
        section.stepIds.collect{
            stepService.findById(it)
        }
    }

    SectionDTO convertSectionToDTO(Section section) {
        new SectionDTO(
                sectionId: section.sectionId,
                steps: getStepsForSection(section),
                description: section.description
        )
    }
}
