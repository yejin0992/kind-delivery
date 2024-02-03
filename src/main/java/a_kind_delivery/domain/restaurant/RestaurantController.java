package a_kind_delivery.domain.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

private final RestaurantService restaurantService;

// 음식점 이름으로 음식 검색

    @GetMapping(value="/restaurant/{id}")
    public RestaurantDTO findResByName(@PathVariable("id") Integer id){
        return restaurantService.findResByName(id);
    }

    @PostMapping(value="/restaurant")
    public void saveRestaurant(@RequestBody RestaurantDTO restaurant){
        restaurantService.saveRestaurant(restaurant);
    }

    @GetMapping(value="restaurants")
    public List<RestaurantDTO> findAllRestaurant(){
        return  restaurantService.findAllRestaurant();
    }
}
