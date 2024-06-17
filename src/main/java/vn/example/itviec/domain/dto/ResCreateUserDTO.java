package vn.example.itviec.domain.dto;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;
import vn.example.itviec.util.constant.GenderEnum;

@Getter
@Setter
public class ResCreateUserDTO {
    private long id;
    private String name;
    private String email;
    private GenderEnum gender;
    private String address;
    private int age;
    private Instant createdAt;
}
