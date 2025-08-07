package javapractice2;
import java.util.*;

public class  javaproject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, String>> teaShops = new ArrayList<>();
        boolean execute = true;

        String[] fieldNames = {"Tea Shop Name", "Owner Name", "Servants", "Product 1", "Product 2"};
        String[] storedValues = null; 

        while (execute) {
            System.out.println("Enter your choice:\n1. Insert Tea Shop Details\n2. Display for-each loop\n3. Display all\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
               
                System.out.println(" TeaShop Name,Owner Name,Servants counts,Product 1,Product 2");
                String inputLine = sc.nextLine();
                storedValues = inputLine.split(",", -1);


            } else if (choice == 2) {

                    Map<String, String> shop = new LinkedHashMap<>();
                    int i = 0;
                    for (String key : fieldNames) {
                        shop.put(key, storedValues[i].trim());
                        System.out.println( key + " - " + storedValues[i].trim());
                        i++;
                    }
                    teaShops.add(shop);
                    System.out.println("----Tea Shop Details added---- ");
                    //storedValues = null;
                

            } else if (choice == 3) {
            	int count = 1;
                for (Map<String, String> ts : teaShops) {
                    System.out.println("Displaying Tea Shop Details" + count++);
                    for (Map.Entry<String, String> entry : ts.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    System.out.println("----------------------");
                }
                }

             else if (choice == 4) {
                System.out.println("Exiting....");
                execute = false;

            } else {
                System.out.println("Invalid input.\n");
            }
        }

    }
}
