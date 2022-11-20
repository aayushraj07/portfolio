package com.example.portfolioBE.service;

import com.example.portfolioBE.dto.ProfileResponseDto;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.UUID;

public interface ProfileService {
    ProfileResponseDto getById(UUID id) throws ChangeSetPersister.NotFoundException;

    List<ProfileResponseDto> getAll();
}
