package a_kind_delivery.domain.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// JpaRepository는 @NoRepositoryBean 상속받고 있음
// 빈으로 직접 등록되지 않지만 SpringDataJPA가 직접 구현하여 bean 생성함
public interface FoodJpaRepository extends JpaRepository<Food, String> {

//음식 찾기
    @Override
    <S extends Food> S save(S Food);

    @Override
    Food getById(String id);

    @Override
    List<Food> findAll();

    @Override
    void deleteById(String id);
}



