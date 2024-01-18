package a_kind_delivery.domain.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody // 클라한테 돌려줄때 데이터형식으로 보내줌
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/findFood/{key}")
    public Food findFoodByKey(@PathVariable("key") int key){
        return foodService.findFood(key);
    }

    @PostMapping("/saveFood")
    public void insertFood(@RequestBody Food food) {
        foodService.saveFood(food);
    }
}
