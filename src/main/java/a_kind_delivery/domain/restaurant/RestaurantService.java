package a_kind_delivery.domain.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    public RestaurantDTO findFoodByName(Integer id) {
        Restaurant restaurantEntity = restaurantRepository.getById(id);
        return restaurantEntity.toRestaurantDTO();
    }

}
