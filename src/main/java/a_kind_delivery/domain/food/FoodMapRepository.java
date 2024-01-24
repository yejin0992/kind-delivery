package a_kind_delivery.domain.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FoodRepository {

    private int id = 1;
    private Map<Integer,Food> db = new HashMap<>();

    //음식 찾기
    public Food findFood(int key){
        return db.get(key);
    }
    
    //음식 저장
    public void saveFood(Food food){
        db.put(id++,food);
    }
    
    //음식 전체 조회
    public Map<Integer,Food> findAllFood(){
        return db;
    }
    
    //음식 개별 수정
    public Food updateFood(int key, Food food){
        return db.replace(key,food);
    }

    //음식 개별 삭제
    public void deleteFood(int key){
        db.remove(key);
    }
}
