package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
//  Optional이란 findById, findByName이 값이 없을 떄 Null을 반환하는데 요즘에는 Null을 그대로 반환하지하고 Optional로 감싸서 내보냄
//  findAll하면 지금까지 저장된 모든 회원 정보를 불러옴
}
