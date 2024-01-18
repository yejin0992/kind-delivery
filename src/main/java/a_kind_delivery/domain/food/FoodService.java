package a_kind_delivery.domain.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food findFood(int key){
        return foodRepository.findFood(key);
    }

    public void saveFood(Food food){
        foodRepository.saveFood(food);
    }

}
