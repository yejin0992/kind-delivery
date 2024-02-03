package a_kind_delivery.domain.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantDTO findResByName(Integer id) {
        Restaurant restaurantEntity = restaurantRepository.getById(id);
        return restaurantEntity.toRestaurantDTO();
    }

    public void saveRestaurant(RestaurantDTO restaurantDTO) {
        restaurantRepository.save(restaurantDTO.toRestaurantEntity());
    }

    public List<RestaurantDTO> findAllRestaurant() {
        List<Restaurant> restaurantList = restaurantRepository.findAll();
        List<RestaurantDTO> resDtoList = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            resDtoList.add(restaurant.toRestaurantDTO());
        }
        return resDtoList;
    }


}
