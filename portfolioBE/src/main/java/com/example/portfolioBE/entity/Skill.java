package com.example.portfolioBE.entity;

import com.example.portfolioBE.enums.Difficulty;
import com.example.portfolioBE.enums.ProjectType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "skill")
@EqualsAndHashCode(callSuper = false)
public class Skill {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "experience")
    private String experience;

    @Column(name = "difficulty", nullable = false)
    private Difficulty difficulty;

    @Column(name = "projects", nullable = false)
    private ProjectType project;
}
