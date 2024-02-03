package a_kind_delivery.domain.user;

import a_kind_delivery.domain.order.Orders;
import a_kind_delivery.domain.restaurant.Restaurant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @Column(name="user_id")
    private String id;

    private String pw;

    private String name;

    private String phone;

    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Restaurant> restaurants = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();

}
