
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
            System.out.println("Added meal");
        } else {
            System.out.println("Meal already exists on menu");
        }
    }

    public void printMeals() {
        if (!this.meals.isEmpty()) {
            System.out.println("========== Menu ==========");
            for (String s : meals) {
                System.out.println(s);
            }
            System.out.println("==========================");
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}