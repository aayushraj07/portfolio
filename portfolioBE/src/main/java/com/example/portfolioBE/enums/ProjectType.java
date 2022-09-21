package com.example.portfolioBE.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProjectType {
    DEPLOYED("deployed"),
    LIVE_PROJECT("live_project"),
    LOCAL_PROJECT("local_project");

    private String projectType;
}
