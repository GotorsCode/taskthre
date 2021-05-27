package com.gotorscode.taskthree.model;

import com.gotorscode.taskthree.dto.UserDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data

public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private Boolean isDeleted = false;

    public UserEntity() {
    }

    public UserEntity(UserDto userDto) {
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
    }
}
