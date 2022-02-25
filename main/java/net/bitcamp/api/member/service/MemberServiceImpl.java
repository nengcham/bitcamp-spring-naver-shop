package net.bitcamp.api.member.service;

import lombok.RequiredArgsConstructor;
import net.bitcamp.api.member.domain.CalcDTO;
import net.bitcamp.api.member.domain.MemberDTO;
import net.bitcamp.api.member.repository.MemberRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            case "%":
                res = a % b;
                break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String getBmi(MemberDTO member) {
        String a = member.getName();
        double b = member.getWeight();
        double c = member.getHeight();
        double resBmi = b / (c * c) * 10000;
        String res = "";
        if (resBmi >= 35) {
            res = "고도 비만";
        } else if (resBmi >= 30) {
            res = "중도 비만 (2단계 비만)";
        } else if (resBmi >= 25) {
            res = "경도 비만 (1단계 비만)";
        } else if (resBmi >= 23) {
            res = "과체중";
        } else if (resBmi >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }
        return String.format("%s 님은 %s 입니다", a, res);
    }

    @Override
    public String getGrade(MemberDTO grade) {
        String a = grade.getName();
        int b = grade.getKor();
        int c = grade.getEng();
        int d = grade.getMath();
        int total = b + c + d ;
        int avg = total / 3;
        String pass = (avg >=60) ? "합격" : "불합격";

        return String.format(
                " ########## Grade ##########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점 \n" +
                        " * 평균(점수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                a, b, c, d, total, avg, pass);
    }

    @Override
    public String login(MemberDTO login) {
        String a = login.getId();
        String b = login.getPassword();


        return (b.equals("00000")) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", a, b)
                : String.format("%s 님의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패", a, b);
    }
}
