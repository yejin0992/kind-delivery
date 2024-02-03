package a_kind_delivery.domain.restaurant;

import a_kind_delivery.domain.food.Food;
import a_kind_delivery.domain.review.Review;
import a_kind_delivery.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Restaurant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="restaurant_id")
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    private String address;

    private String description;

    @OneToMany(mappedBy = "restaurant")
    private List<Food> food = new ArrayList<>();

    @OneToMany(mappedBy = "restaurant")
    private List<Review> reviews = new ArrayList<>();


    @Builder
    public Restaurant(Integer id, String name, User user, String address, String description, List<Food> food, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.address = address;
        this.description = description;
        this.food = food;
        this.reviews = reviews;
    }

    //Entity -> DTO
    public RestaurantDTO toRestaurantDTO(){
        return RestaurantDTO.builder()
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
