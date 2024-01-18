package a_kind_delivery.domain.food;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FoodRepository {

    private int id = 1;
    private Map<Integer,Food> db = new HashMap<>();

    public Food findFood(int key){
        return db.get(key);
    }

    public void saveFood(Food food){
        db.put(id++,food);
    }
}
