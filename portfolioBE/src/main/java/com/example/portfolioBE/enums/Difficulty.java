package com.example.portfolioBE.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Difficulty {
    AMAETURE("amaeture"),
    PROFESSIONAL("professional"),
    INTERMEDIATE("intermediate");

   private String difficulties;
}
