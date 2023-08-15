import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseManagementSystem {

  private List<Restaurant> listOfRestaurants = new ArrayList<Restaurant>();
  private List<Food> listOfFoods = new ArrayList<Food>();

  private boolean isAddedRestaurant(Restaurant restaurant) {
    for (Restaurant r : listOfRestaurants) {
      if (r.getName().equalsIgnoreCase(restaurant.getName())) {
        return true;
      }
    }
    return false;
  }

  private boolean isAddedFood(Food food) {
    for (Food r : listOfFoods) {
      if (r.getName().equalsIgnoreCase(food.getName())) {
        return true;
      }
    }
    return false;
  }

  //Search for restaurant
  public Restaurant searchRestaurantByName(String name) {
    for (Restaurant x : listOfRestaurants) {
      if (x.getName().equalsIgnoreCase(name)) {
        return x;
      }
    }
    return null;
  }

  public List<Restaurant> searchRestaurantsByScore(
    double minScore,
    double maxScore
  ) {
    List<Restaurant> list = new ArrayList<Restaurant>();

    for (Restaurant x : listOfRestaurants) {
      if (x.getScore() >= minScore && x.getScore() <= maxScore) {
        list.add(x);
      }
    }
    return list;
  }

  public List<Restaurant> searchRestaurantsByCategory(String category) {
    List<Restaurant> list = new ArrayList<Restaurant>();

    for (Restaurant x : listOfRestaurants) {
      if (
        x.getCategory1().equalsIgnoreCase(category) ||
        x.getCategory2().equalsIgnoreCase(category) ||
        x.getCategory3().equalsIgnoreCase(category)
      ) {
        list.add(x);
      }
    }
    return list;
  }

  public List<Restaurant> searchRestaurantsByPrice(String price) {
    List<Restaurant> list = new ArrayList<Restaurant>();

    for (Restaurant x : listOfRestaurants) {
      if (x.getPrice().equalsIgnoreCase(price)) {
        list.add(x);
      }
    }
    return list;
  }

  public List<Restaurant> searchRestaurantsByZipCode(String zipCode) {
    List<Restaurant> list = new ArrayList<Restaurant>();

    for (Restaurant x : listOfRestaurants) {
      if (x.getZipCode().equalsIgnoreCase(zipCode)) {
        list.add(x);
      }
    }
    return list;
  }

  public Map<String, List<String>> getRestaurantNamesByCategory() {
    Map<String, List<String>> list = new HashMap<String, List<String>>();

    for (Restaurant x : listOfRestaurants) {
      list.add(x.getCategory1(), x.getName());
    }
  }

  // Search for food items
  public Food searchFoodByName(String name) {
    for (Food x : listOfFoods) {
      if (x.getName().equalsIgnoreCase(name)) {
        return x;
      }
    }
    return null;
  }

  // Add restaurant
  public boolean addRestaurant(Restaurant restaurant) {
    if (isAddedRestaurant(restaurant)) {
      return false;
    }
    listOfRestaurants.add(restaurant);
    return true;
  }

  // Add food item
  public boolean addFood(Food food) {
    if (isAddedFood(food)) {
      return false;
    }
    listOfFoods.add(food);
    return true;
  }
}
