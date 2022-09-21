package com.example.portfolioBE.service.impl;

import com.example.portfolioBE.dto.ProfileResponseDto;
import com.example.portfolioBE.entity.Profile;
import com.example.portfolioBE.repository.ProfileRepository;
import com.example.portfolioBE.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository repository;

    @Override
    public ProfileResponseDto getById(UUID id) {
        Optional<Profile> profile = repository.findById(id);
        ProfileResponseDto profileResponseDto = new ProfileResponseDto();
        profileResponseDto.setAge(profile.get().getAge());
        profileResponseDto.setName(profile.get().getName());
        return profileResponseDto;
    }
}
