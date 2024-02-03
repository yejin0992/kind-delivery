package a_kind_delivery.domain.restaurant;

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
        restaurantService.deleteRestaurant(id);
    }
}
