package a_kind_delivery.domain.restaurant;

import a_kind_delivery.domain.Exception.MyException;
import a_kind_delivery.domain.food.FoodDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

private final RestaurantService restaurantService;


    @GetMapping(value="/restaurant/{id}")
    public RestaurantDTO findResByName(@PathVariable("id") Integer id){
            if(id<0) {
                throw new MyException("음수는 입력할 수 없습니다.");
            }
        return restaurantService.findResByName(id);
    }

    @PostMapping(value="/restaurant")
    public void saveRestaurant(@RequestBody RestaurantDTO restaurant){
        restaurantService.saveRestaurant(restaurant);
    }

    @GetMapping(value="/restaurants")
    public List<RestaurantDTO> findAllRestaurant(){
        return  restaurantService.findAllRestaurant();
    }

    @DeleteMapping(value="/restaurant/{id}")
    public void deleteRestaurant(@PathVariable("id") Integer id){
        if(id<0) {
            throw new MyException("음수는 입력할 수 없습니다.");
        }
        restaurantService.deleteRestaurant(id);
    }
}
