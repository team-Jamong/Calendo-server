package Jamong.calender.domain.member.repository;

import Jamong.calender.domain.member.dto.MemberDto;
import Jamong.calender.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

}
