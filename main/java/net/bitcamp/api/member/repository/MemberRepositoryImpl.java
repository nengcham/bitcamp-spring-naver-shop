package net.bitcamp.api.member.repository;

import net.bitcamp.api.member.domain.CalcDTO;
import net.bitcamp.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String getBmi(MemberDTO member) {
        return null;
    }

    @Override
    public String getGrade(MemberDTO grade) {
        return null;
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }
}
