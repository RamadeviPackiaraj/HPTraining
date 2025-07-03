import java.util.*;
public class BillGenerator{
    public static int FindPrice(int[] pincode,int[] price,int pin,int quantity){
        int newprice=0;
        for(int i=0;i<pincode.length;i++){
            if(pincode[i]==pin){
                newprice=quantity*price[i];
            }
        }
            return newprice;
    }
    public static int details(int[] pincode, int[] price) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pincode of the Product:");
    int pin = sc.nextInt();
    System.out.println("Quantity of the Product:");
    int quantity = sc.nextInt();
    int priceCalc = FindPrice(pincode, price, pin, quantity);
    System.out.println("Product Total: " + priceCalc);
    return priceCalc;
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] pincode = {101, 102, 103};
    String[] Product = {"Keyboard", "Mouse", "Monitor"};
    int[] price = {5000, 4000, 3500};

    // First sale
    System.out.println("Pincode of the Product:");
    int pin = sc.nextInt();
    System.out.println("Quantity of the Product:");
    int quantity = sc.nextInt();
    int total = FindPrice(pincode, price, pin, quantity);
    System.out.println("Product Total: " + total);

    System.out.println("Do you want to sell another product? 1: Yes  2: No");
    int another = sc.nextInt();

    // Loop for additional sales
    while (another == 1) {
        int newPrice = details(pincode, price);  // Get new price from details()
        total += newPrice;  // Update total
        System.out.println("Current Total: " + total);
        System.out.println("Do you want to sell another product? 1: Yes  2: No");
        another = sc.nextInt();
    }

    System.out.println("Final Total Bill: " + total);
    sc.close();
}

}