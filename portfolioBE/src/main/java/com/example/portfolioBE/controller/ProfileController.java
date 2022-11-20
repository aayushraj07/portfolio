package com.example.portfolioBE.controller;

import com.example.portfolioBE.dto.ProfileResponseDto;
import com.example.portfolioBE.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api/profile")
public class ProfileController {

    private final ProfileService service;

    @GetMapping("/{id}")
    public ProfileResponseDto getById(@PathVariable UUID id){
        return service.getById(id);
    }

    @GetMapping
    public List<ProfileResponseDto> getAll(){
        return service.getAll();
    }
}
