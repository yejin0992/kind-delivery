package a_kind_delivery.domain.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodJpaRepository jpaRepository;

    //음식 찾기
    @Transactional(readOnly = true)
    public FoodDTO findFood(Integer id) {
        Food foodEntity = jpaRepository.getById(id);
        return foodEntity.toFoodDTO();
    }


    //음식 저장 및 수정
    @Transactional
    public void saveFood(FoodDTO food) {
        System.out.println("푸드 서비스 도착");
        jpaRepository.save(food.toFoodEntity());
    }

    //음식 전체 조회
    @Transactional(readOnly = true)
    public List<FoodDTO> findAllFood() {
        List<Food> foodList = jpaRepository.findAll();
        //FoodEntity List -> FoodDTO List
        List<FoodDTO> foodDtoList = new ArrayList<>();
        for (Food food : foodList) {
            foodDtoList.add(food.toFoodDTO());
        }
        return foodDtoList;
    }

    //음식 개별 삭제
    @Transactional
    public void deleteFood(Integer id) {
        jpaRepository.deleteById(id);
    }
}
