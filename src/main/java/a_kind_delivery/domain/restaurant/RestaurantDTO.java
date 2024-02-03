package a_kind_delivery.domain.restaurant;

import a_kind_delivery.domain.food.Food;
import a_kind_delivery.domain.review.Review;
import a_kind_delivery.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class RestaurantDTO {

    private int id;
    private String name;
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    private User user;
    private String address;
    private String description;
    @JsonIgnore
    private List<Food> food = new ArrayList<>();
    @JsonIgnore
    private List<Review> reviews = new ArrayList<>();

    @Builder
    public RestaurantDTO(int id, String name, User user, String address, String description, List<Food> food, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.address = address;
        this.description = description;
        this.food = food;
        this.reviews = reviews;
    }

    // DTO -> Entity
    public Restaurant toRestaurantEntity(){
        return Restaurant.builder()
                .id(id)
                .name(name)
                .user(user)
                .address(address)
                .description(description)
                .food(food)
                .reviews(reviews)
                .build();
    }
}
