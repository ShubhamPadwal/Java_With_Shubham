import java.util.*;
public class ShoppingCart {

	public static void main(String[]args) {
		ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add 5 items to your shopping cart:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter item " + (i) + ": ");
            String item = scanner.nextLine();
            cart.add(item);
        }
        
     // Print out the list of items in the cart
        
        System.out.println("Items in your shopping cart:");
        for (String item : cart) {
            System.out.println(item);
        }
	}
}
