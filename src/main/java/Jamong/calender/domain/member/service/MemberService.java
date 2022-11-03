package Jamong.calender.domain.member.service;

import Jamong.calender.domain.member.dto.MemberDto;
import Jamong.calender.domain.member.entity.Member;
import Jamong.calender.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void saveMember(MemberDto memberDto) {
        Member member = Member.builder()
                .login_id(memberDto.getLogin_id())
                .password(memberDto.getPassword())
                .name(memberDto.getName())
                .build();

        memberRepository.save(member);
    }
}
