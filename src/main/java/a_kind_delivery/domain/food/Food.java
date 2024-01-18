package a_kind_delivery.domain.food;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Food {
    String food_id;
    String food_name;
    int price;
    String description;
    String restaurant_id;
}
