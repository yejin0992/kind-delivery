package a_kind_delivery.domain.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

private final RestaurantService restaurantService;

// 음식점 이름으로 음식 검색

    @GetMapping(value="/restaurant/{id}")
    public RestaurantDTO findFoodByName(@PathVariable("id") Integer id){
        return restaurantService.findFoodByName(id);
    }

}
