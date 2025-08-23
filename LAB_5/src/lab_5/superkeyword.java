package lab_5;
class Order 
{
 int orderId;
 String customerName;
 public Order(int orderId, String customerName) 
 {
     this.orderId = orderId;
     this.customerName = customerName;
 }
 public void printDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Customer: " + customerName);
 }
}
class OnlineOrder extends Order 
{
 String deliveryAddress;
 public OnlineOrder(int orderId, String customerName, String deliveryAddress) {
     super(orderId, customerName); 
     this.deliveryAddress = deliveryAddress;
 }
 public void printDetails() 
 {
     super.printDetails();
     System.out.println("Delivery Address: " + deliveryAddress);
 }
}
public class superkeyword 
{
 public static void main(String[] args) 
 {
     OnlineOrder order = new OnlineOrder(101, "Sreevarsha", "Hyderabad, India");
     order.printDetails();
 }
}

