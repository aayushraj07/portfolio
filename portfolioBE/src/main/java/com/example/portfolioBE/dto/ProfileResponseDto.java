package com.example.portfolioBE.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileResponseDto {
    private UUID id;
    private String name;
    private Integer age;
}
