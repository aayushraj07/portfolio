package com.example.portfolioBE.dto;

import com.example.portfolioBE.entity.Skill;
import com.example.portfolioBE.entity.SocialMeida;
import lombok.*;

import java.util.List;
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
    private List<Skill> skillList;
    private List<SocialMeida> socialMeidas;
}
