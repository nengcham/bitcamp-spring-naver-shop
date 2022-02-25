package net.bitcamp.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: net.bitcamp.api.member.domain
 * fileName   : CalcDTO
 * author     : ChoiGeonIl
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-25    ChoiGeonIl     최초 생성
 */
@Data
@Component
public class CalcDTO {
    private int num1;
    private String opcode;
    private int num2;
}
