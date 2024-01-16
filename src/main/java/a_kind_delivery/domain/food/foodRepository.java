package a_kind_delivery.domain.food;

import org.springframework.stereotype.Repository;

@Repository
public class foodRepository {

    String food_id;
    String food_name;
    String food_category;

    public foodRepository() {
    }

    public foodRepository(String food_id, String food_name, String food_category) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.food_category = food_category;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_category() {
        return food_category;
    }

    public void setFood_category(String food_category) {
        this.food_category = food_category;
    }
}
