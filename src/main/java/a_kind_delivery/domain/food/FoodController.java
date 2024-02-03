package a_kind_delivery.domain.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@ResponseBody // 클라한테 돌려줄때 데이터형식으로 보내줌
@RequiredArgsConstructor // final 가지고 있는 필드 생성자에 자동 주입
public class FoodController {

    private final FoodService foodService;

    // 음식 찾기
    // 데이터는 정확히 찾아지지만, 출력 시 500 에러 ==> DTO로 복사하여 출력하였더니 에러해결!
    @GetMapping(value = "/food/{id}")
    public FoodDTO findFoodById(@PathVariable("id") String id){
        return foodService.findFood(id);
    }

    // 음식 저장 및 수정
    @PostMapping(value="/food")
    public void insertFood(@RequestBody FoodDTO food) {
        foodService.saveFood(food);
    }

    // 음식 전체 조회
    @GetMapping(value = "/foods")
    public List<FoodDTO> findAllFood(){
        return foodService.findAllFood();
    }


    // 음식 개별 삭제
    @DeleteMapping(value="/food/{id}")
    public void deleteFood(@PathVariable("id") String id){
        foodService.deleteFood(id);
    }
}


