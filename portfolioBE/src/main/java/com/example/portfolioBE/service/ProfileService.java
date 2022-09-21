package com.example.portfolioBE.service;

import com.example.portfolioBE.dto.ProfileResponseDto;

import java.util.UUID;

public interface ProfileService {
    ProfileResponseDto getById(UUID id);
}
