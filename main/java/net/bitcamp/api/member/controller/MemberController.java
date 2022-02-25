package net.bitcamp.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.bitcamp.api.member.domain.CalcDTO;
import net.bitcamp.api.member.domain.MemberDTO;
import net.bitcamp.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private  final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc) {
        return service.calc(calc);
    }

    @PostMapping("/bmi")
    public String getBmi(@RequestBody MemberDTO member){
        return service.getBmi(member);
    }

    @PostMapping("/grade")
    public String getGrade(@RequestBody MemberDTO grade){
        return service.getGrade(grade);
    }

    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }
}
