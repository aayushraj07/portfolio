package com.example.portfolioBE.service.impl;

import com.example.commons.exceptions.NotFoundException;
import com.example.portfolioBE.dto.ProfileResponseDto;
import com.example.portfolioBE.entity.Profile;
import com.example.portfolioBE.mapper.ModelMapperEntityToDto;
import com.example.portfolioBE.mapper.ProfileMapper;
import com.example.portfolioBE.repository.ProfileRepository;
import com.example.portfolioBE.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.example.commons.utils.Constants.EVENT_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository repository;

    private final ProfileMapper mapper;

    private final ModelMapperEntityToDto modelMapper;

    @Override
    public ProfileResponseDto getById(UUID id) throws ChangeSetPersister.NotFoundException {
        Profile profile = repository.findById(id).orElseThrow(() -> new NotFoundException(EVENT_NOT_FOUND));;
        return mapper.toDto(profile);
//        ProfileResponseDto profileResponseDto = new ProfileResponseDto();
//        ProfileResponseDto profileResponseDto1 = modelMapper.toDto(profile);
//        profileResponseDto.setAge(profile.get().getAge());
//        profileResponseDto.setName(profile.get().getName());
//        return profileResponseDto;
    }


//    @Override
//    public StationResponseDto create(StationRequestDto stationRequestDto) {
//        if (repository.findByName(stationRequestDto.getName()).isPresent())
//            throw new AlreadyExistsException("STATION_ALREADY_EXISTS : " + stationRequestDto.getName());
//        return mapper.toDto(repository.save(mapper.toEntity(stationRequestDto)));
//    }

    @Override
    public List<ProfileResponseDto> getAll() {
        return null;
    }
}
