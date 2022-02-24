package net.bitcamp.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MemberDTO {

    private String userId;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;

}
