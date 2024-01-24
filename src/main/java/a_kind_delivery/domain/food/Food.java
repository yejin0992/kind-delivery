package a_kind_delivery.domain.food;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Food {

    @Id
    @Column(name="food_id")
    String food_id;
    String food_name;
    int price;
    String description;
    // restaurant entity 생성 후 @OneToOne
    String restaurant_id;
}
