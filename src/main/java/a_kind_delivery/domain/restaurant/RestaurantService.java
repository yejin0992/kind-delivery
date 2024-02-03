package a_kind_delivery.domain.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Transactional(readOnly = true)
    public RestaurantDTO findResByName(Integer id) {
        Restaurant restaurantEntity = restaurantRepository.getById(id);
        return restaurantEntity.toRestaurantDTO();
    }

    @Transactional
    public void saveRestaurant(RestaurantDTO restaurantDTO) {
        restaurantRepository.save(restaurantDTO.toRestaurantEntity());
    }

    @Transactional(readOnly = true)
    public List<RestaurantDTO> findAllRestaurant() {
        List<Restaurant> restaurantList = restaurantRepository.findAll();
        List<RestaurantDTO> resDtoList = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            resDtoList.add(restaurant.toRestaurantDTO());
        }
        return resDtoList;
    }

    @Transactional
    public void deleteRestaurant(Integer id){
        restaurantRepository.deleteById(id);
    }

}
