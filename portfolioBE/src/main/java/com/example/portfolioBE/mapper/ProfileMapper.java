package com.example.portfolioBE.mapper;

import com.example.portfolioBE.dto.ProfileResponseDto;
import com.example.portfolioBE.entity.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProfileMapper extends ModelMapperEntityToDto<Profile, ProfileResponseDto>,
        ModelMapperDtoToEntity<ProfileResponseDto, Profile> {}
