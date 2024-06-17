package vn.example.itviec.domain.dto;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;
import vn.example.itviec.util.constant.GenderEnum;

@Getter
@Setter
public class ResUpdateUserDTO {
    private long id;
    private String name;
    private GenderEnum gender;
    private String address;
    private int age;
    private Instant updatedAt;
}