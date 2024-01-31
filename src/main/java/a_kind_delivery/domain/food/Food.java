package a_kind_delivery.domain.food;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Food {

    @Id
    @Column(name="food_id")
    String food_id;
    String food_name;
    int price;
    String description;
    String restaurant_id;

    @Builder
    public Food(String food_id, String food_name, int price, String description, String restaurant_id) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.price = price;
        this.description = description;
        this.restaurant_id = restaurant_id;
    }


    // Entity -> DTO
    public FoodDTO toFoodDTO(){
        return FoodDTO.builder()
                .food_id(food_id)
                .food_name(food_name)
                .price(price)
                .description(description)
                .restaurant_id(restaurant_id)
                .build();
    }
}
