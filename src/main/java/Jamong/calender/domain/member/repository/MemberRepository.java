package Jamong.calender.domain.member.repository;

import Jamong.calender.domain.member.dto.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberDto,Integer> {

}
