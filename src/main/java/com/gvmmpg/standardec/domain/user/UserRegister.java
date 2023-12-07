package com.gvmmpg.standardec.domain.user;

import java.time.LocalDate;

public record UserRegister(String user_name,
                           String user_login,
                           String user_password,
                           LocalDate user_birthday,
                           String user_country,
                           String user_city,
                           String user_address,
                           String user_profession,
                           String user_level_schooling,
                           String user_gender,
                           String user_race
) {}
