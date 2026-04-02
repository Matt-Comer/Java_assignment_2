package Assignment_2;
public class Lunchbox {
  
  private String customerName;
  private String mainItem;
  private int quantity;
  private double price;
  private boolean isDelivered;

  public Lunchbox(String customerName, String mainItem, int quantity, double price, boolean isDelivered){
    this.customerName = customerName;
    this.mainItem = mainItem;
    this.quantity = quantity;
    this.price = price;
    this.isDelivered = isDelivered;
  }
    
   public String getCustomerName() {
    return customerName;
   }

   public String getMainItem() {
    return mainItem;
   }

   public int getQuantity() {
    return quantity;
   }

    public double getPrice() {
      return price;
    }

    public boolean isDelivered() {
      return isDelivered;
    }
   
    public void setCustomerName(String customerName) {
      this.customerName = customerName;
    }

    public void setMainItem(String mainItem) {
      this.mainItem = mainItem;
    }

    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
      
    public void setPrice(double price) {
      this.price = price;
    }

    public void setDelivered(boolean isDelivered) {
    this.isDelivered = isDelivered;
    }

   public void displayOrder() {
    System.out.println("Customer: " + customerName);
    System.out.println("Item: " + mainItem);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: $" + price);
    System.out.println("Delivered: " + isDelivered);
   
   }
   public void markDelivered() {
    this.isDelivered = true;
   }

    
  }
    
  

