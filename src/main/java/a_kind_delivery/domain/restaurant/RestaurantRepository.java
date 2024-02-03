package a_kind_delivery.domain.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {


    // 음식점 찾기
    @Override
    Restaurant getById(Integer id);
}
