package a_kind_delivery.domain.food;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;


@Controller
@ResponseBody // 클라한테 돌려줄때 데이터형식으로 보내줌
@RequiredArgsConstructor // final 가지고 있는 필드 생성자에 자동 주입
public class FoodController {

    private final FoodService foodService;

    // 음식 찾기
    // 데이터는 정확히 찾아지지만, 출력 시 500 에러
    @RequestMapping(value = "/findFood/{id}", method= RequestMethod.GET)
    public Food findFoodById(@PathVariable("id") String id){
        return foodService.findFood(id);
    }

    // 음식 저장 및 수정
    @RequestMapping(value="/saveFood", method= RequestMethod.POST)
    public void insertFood(@RequestBody Food food) {
        foodService.saveFood(food);
    }

    // 음식 전체 조회
    @RequestMapping(value = "/findAllFood", method=RequestMethod.GET)
    public List<Food> findAllFood(){
        return foodService.findAllFood();
    }


    // 음식 개별 삭제
    @RequestMapping(value="/deleteFood/{id}", method= RequestMethod.DELETE)
    public void deleteFood(@PathVariable("id") String id){
        foodService.deleteFood(id);
    }
}


