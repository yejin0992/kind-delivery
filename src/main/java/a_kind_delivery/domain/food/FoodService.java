package a_kind_delivery.domain.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    //음식 찾기
    public Food findFood(int key){
        return foodRepository.findFood(key);
    }

    //음식 저장
    public void saveFood(Food food){
        foodRepository.saveFood(food);
    }

    //음식 전체 조회
    public java.util.Map<Integer, Food> findAllFood(){
        return foodRepository.findAllFood();
    }

    //음식 개별 수정
    public Food updateFood(int key, Food food){
        return foodRepository.updateFood(key, food);
    }

    //음식 개별 삭제
    public void deleteFood(int key){
        foodRepository.deleteFood(key);
    }
}
