package a_kind_delivery.domain.food;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor //기본생성자
public class FoodDTO {
    String food_id;
    String food_name;
    int price;
    String description;
    String restaurant_id;

    @Builder
    public FoodDTO(String food_id, String food_name, int price, String description, String restaurant_id) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.price = price;
        this.description = description;
        this.restaurant_id = restaurant_id;
    }


    // DTO -> Entity
    public Food toFoodEntity(){
        return Food.builder()
                .food_id(food_id)
                .food_name(food_name)
                .price(price)
                .description(description)
                .restaurant_id(restaurant_id)
                .build();
    }
}
