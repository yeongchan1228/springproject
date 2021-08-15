package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id);// 없으면 null로 반환해줌
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
