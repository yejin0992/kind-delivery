package a_kind_delivery.domain.user;

import a_kind_delivery.domain.order.Orders;
import a_kind_delivery.domain.restaurant.Restaurant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
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
    @Column(name = "user_id")
    private String id;

    private String pw;

    private String name;

    private String phone;

    private String address;

    @OneToMany(mappedBy = "user")
    private List<Restaurant> restaurants = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();

    @Builder
    public User(String id, String pw, String name, String phone, String address, List<Restaurant> restaurants, List<Orders> orders) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.restaurants = restaurants;
        this.orders = orders;
    }

}
