public class Food {

  private int restaurantId;
  private String category;
  private String name;
  private double price;

  
  public Food(int restaurantId, String category, String name, double price) {
    this.restaurantId = restaurantId;
    this.category = category;
    this.name = name;
    this.price = price;
  }

  // public getters
  public int getRestaurantId() {
    return restaurantId;
  }

  public String getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}
