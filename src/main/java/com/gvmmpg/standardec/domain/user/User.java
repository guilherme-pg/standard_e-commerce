package com.gvmmpg.standardec.domain.user;


import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String user_name;

    @Column(name = "email")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private LocalDate user_birthday;

    @Column(name = "country")
    private String user_country;

    @Column(name = "city")
    private String user_city;

    @Column(name = "address")
    private String user_address;

    @Column(name = "profession")
    private String user_profession;

    @Column(name = "schooling_level")
    private String user_level_schooling;

    @Column(name = "gender")
    private String user_gender;

    @Column(name = "race")
    private String user_race;


    public User(UserRegister data) {
        this.user_name = data.user_name();
        this.login = data.user_login();
        this.password = data.user_password();
        this.user_birthday = data.user_birthday();
        this.user_country = data.user_country();
        this.user_city = data.user_city();
        this.user_address = data.user_address();
        this.user_profession = data.user_profession();
        this.user_level_schooling = data.user_level_schooling();
        this.user_gender = data.user_gender();
        this.user_race = data.user_race();
    }



}
