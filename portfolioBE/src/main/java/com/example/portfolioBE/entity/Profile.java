package com.example.portfolioBE.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "profile")
@EqualsAndHashCode(callSuper = false)
public class Profile {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @ManyToOne
    private Group group;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private List<Skill> skills;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "social_media_id")
    private List<SocialMeida> socialMeidas;
}
