package a_kind_delivery.domain.food;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FoodService {

    private final FoodJpaRepository jpaRepository;
    //private FoodRepository foodRepository;

    //음식 찾기
    public Food findFood(String id){
        return jpaRepository.getById(id);
    }


    //음식 저장 및 수정
    public void saveFood(Food food){
        jpaRepository.save(food);
    }

    //음식 전체 조회
    public List<Food> findAllFood(){
        return jpaRepository.findAll();
    }


    //음식 개별 삭제
    public void deleteFood(String id){
        jpaRepository.deleteById(id);
    }
}
