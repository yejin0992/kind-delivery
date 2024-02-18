package a_kind_delivery.domain.food;

import a_kind_delivery.domain.restaurant.Restaurant;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor //기본생성자
public class FoodDTO {
    Integer id;
    String name;
    int price;
    String description;
    Restaurant restaurant;

    @Builder
    public FoodDTO(int id, String name, int price, String description, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.restaurant = restaurant;
    }

    // DTO -> Entity
    public Food toFoodEntity() {
        Food.FoodBuilder foodBuilder = Food.builder()
                .name(name)
                .price(price)
                .description(description);

        if (id != null) {
            foodBuilder.id(id);
        }

        return foodBuilder.build();
    }

}
