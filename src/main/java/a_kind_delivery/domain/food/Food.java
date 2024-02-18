package a_kind_delivery.domain.food;

import a_kind_delivery.domain.restaurant.Restaurant;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int price;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    @Builder
    public Food(int id, String name, int price, String description, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.restaurant = restaurant;
    }


    // Entity -> DTO
    public FoodDTO toFoodDTO(){
        return FoodDTO.builder()
                .id(id)
                .name(name)
                .price(price)
                .description(description)
                .restaurant(restaurant)
                .build();
    }
}
