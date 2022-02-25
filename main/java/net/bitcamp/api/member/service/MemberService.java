package net.bitcamp.api.member.service;


import net.bitcamp.api.member.domain.CalcDTO;
import net.bitcamp.api.member.domain.MemberDTO;

public interface MemberService {

    String calc(CalcDTO calc);

    String getBmi(MemberDTO member);

    String getGrade(MemberDTO grade);

    String login(MemberDTO login);
}