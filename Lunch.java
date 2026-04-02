package Assignment_2;
public class Lunch {

  public static void main(String[] args) {
    
    Lunchbox order1 = new Lunchbox("Matt", "Burger", 2, 12.99, false);
    Lunchbox order2 = new Lunchbox("Pheonix", "Pizza", 1, 9.99, false);
    Lunchbox order3 = new Lunchbox("Skylar", "Pasta", 3, 14.50, false);
  

  Lunchbox [] orders = { order1, order2, order3,};

  orders[0].markDelivered();

  for(int i = 0; i < orders.length; i++) {
    orders[i].displayOrder();
  }
}
  }
