/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author alyss
 */
    
public class PlaceAnOrder {
    // Inventory: item numbers and prices
    private static final int[] itemNumbers = {111, 222, 333, 444};
    private static final double[] itemPrices = {0.89, 1.47, 2.43, 5.99};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt for item number
            System.out.print("Enter item number: ");
            String itemInput = sc.nextLine();

            int itemNumber;
            try {
                itemNumber = Integer.parseInt(itemInput);
            } catch (NumberFormatException e) {
                throw new OrderException(OrderMessages.messages[0]);
            }

            if (itemNumber < 0) throw new OrderException(OrderMessages.messages[1]);
            if (itemNumber > 9999) throw new OrderException(OrderMessages.messages[2]);

            // Prompt for quantity
            System.out.print("Enter quantity: ");
            String qtyInput = sc.nextLine();

            int quantity;
            try {
                quantity = Integer.parseInt(qtyInput);
            } catch (NumberFormatException e) {
                throw new OrderException(OrderMessages.messages[3]);
            }

            if (quantity < 1) throw new OrderException(OrderMessages.messages[4]);
            if (quantity > 12) throw new OrderException(OrderMessages.messages[5]);

            // Check if item exists in inventory
            int index = -1;
            for (int i = 0; i < itemNumbers.length; i++) {
                if (itemNumbers[i] == itemNumber) {
                    index = i;
                    break;
                }
            }
            if (index == -1) throw new OrderException(OrderMessages.messages[6]);

            // Calculate total
            double total = quantity * itemPrices[index];
            System.out.printf("Order successful! Total due: $%.2f%n", total);

        } catch (OrderException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

