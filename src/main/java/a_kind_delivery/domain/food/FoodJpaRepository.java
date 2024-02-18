package a_kind_delivery.domain.food;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository는 @NoRepositoryBean 상속받고 있음
// 빈으로 직접 등록되지 않지만 SpringDataJPA가 직접 구현하여 bean 생성함
public interface FoodJpaRepository extends JpaRepository<Food, Integer> {

    //음식 찾기
    @Override
    Food getById(Integer id);

    // 음식 저장 및 수정
    @Override
    <S extends Food> S save(S Food);

    // 음식 전체 조회
    @Override
    List<Food> findAll();

    // 음식 개별 삭제
    @Override
    void deleteById(Integer id);
}



