package com.example.terminallayoutdemo.service

import com.example.terminallayoutdemo.domain.Section
import com.example.terminallayoutdemo.domain.Title
import com.example.terminallayoutdemo.domain.TitleDTO
import com.example.terminallayoutdemo.repository.TitleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TitleService {
    @Autowired TitleRepository titleRepsitory

    TitleDTO addSection(Title title)  {
        titleRepsitory.save(title)
    }

    List<TitleDTO> getAll() {
        titleRepsitory.findAll() as List
    }

    TitleDTO findById(Long id)  {
        titleRepsitory.findById(id).get()
    }
}
