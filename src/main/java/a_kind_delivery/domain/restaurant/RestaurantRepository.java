package a_kind_delivery.domain.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {


    @Override
    Restaurant getById(Integer id);

    @Override
    <S extends Restaurant> S save(S Restaurant);

    @Override
    List<Restaurant> findAll();

    @Override
    void deleteById(Integer id);
}
