package net.bitcamp.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.bitcamp.api.member.domain.MemberDTO;
import net.bitcamp.api.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private  final MemberService service;

    @GetMapping("/member/bmi/{name}/{height}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight) {
        System.out.println("리액트에서 넘어온 이름: " + name);
        System.out.println("리액트에서 넘어온 키: " + height);
        System.out.println("리액트에서 넘어온 몸무게: " + weight);

        return "BMI는 정상";
    }

}
