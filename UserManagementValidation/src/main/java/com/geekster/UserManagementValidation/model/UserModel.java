package com.geekster.UserManagementValidation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
   @NotNull

    private Integer userId;
    @NotEmpty
    @NotNull
    @Pattern(regexp = "[A-Za-z]+\\s+[A-Za-z]+")
    private String userName;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$\n")
    private String email;
    @Pattern(regexp = "[0-9]+")
    private String phoneNumber;
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String dateOfBirth;
   @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String date;
   @Pattern(regexp ="^[0-2][0-3]:[0-5][0-9]$")
    private String time;


}
