package a_kind_delivery.domain.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;


@Controller
@ResponseBody // 클라한테 돌려줄때 데이터형식으로 보내줌
public class FoodController {

    @Autowired
    private FoodService foodService;

    // 음식 찾기
    @RequestMapping(value = "/findFood/{key}", method= RequestMethod.GET)
    public Food findFoodByKey(@PathVariable("key") int key){
        return foodService.findFood(key);
    }

    // 음식 저장
    @RequestMapping(value="/saveFood", method= RequestMethod.POST)
    public void insertFood(@RequestBody Food food) {
        foodService.saveFood(food);
    }

    // 음식 전체 조회
    @RequestMapping(value = "/findAllFood", method=RequestMethod.GET)
    public java.util.Map<Integer,Food> findAllFood(){
        return foodService.findAllFood();
    }

    // 음식 개별 수정
    @RequestMapping(value="/updateFood/{key}", method = RequestMethod.PATCH)
    public Food updateFood(@PathVariable("key") int key, @RequestBody Food food){
        return foodService.updateFood(key,food);
    }

    // 음식 개별 삭제
    @RequestMapping(value="/deleteFood/{key}", method= RequestMethod.DELETE)
    public void deleteFood(@PathVariable("key") int key){
        foodService.deleteFood(key);
    }
}


