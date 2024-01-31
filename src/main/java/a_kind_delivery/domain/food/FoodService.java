package a_kind_delivery.domain.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FoodService {

    private final FoodJpaRepository jpaRepository;
    //private FoodRepository foodRepository;

    //음식 찾기
    public FoodDTO findFood(String id){
        Food foodEntity = jpaRepository.getById(id);
        return foodEntity.toFoodDTO();
    }


    //음식 저장 및 수정
    public void saveFood(FoodDTO food){
        jpaRepository.save(food.toFoodEntity());
    }

    //음식 전체 조회
    public List<FoodDTO> findAllFood(){
        List<Food> foodList =  jpaRepository.findAll();
        //FoodEntity List -> FoodDTO List
        List<FoodDTO> foodDtoList = new ArrayList<>();
        for(Food food : foodList){
            foodDtoList.add(food.toFoodDTO());
        }
        return foodDtoList;
    }


    //음식 개별 삭제
    public void deleteFood(String id){
        jpaRepository.deleteById(id);
    }
}
