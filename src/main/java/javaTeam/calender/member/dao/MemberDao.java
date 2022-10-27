package javaTeam.calender.member.dao;

import javaTeam.calender.member.dto.MemberDto;

public interface MemberDao {
    public String loginCheck(MemberDto memberDto);
}
