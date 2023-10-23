package ShoppingList;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> Shopping = new ArrayList<String>();

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add an item");
			System.out.println("2. Remove an item");
			System.out.println("3. Display the list");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Add an item\n");
				String item = scanner.next();
				Shopping.add(item);
				System.out.println(item);
				System.out.println("");
				break;

			case 2:
				System.out.println("Remove an item\n");
				String items = scanner.next();
				Shopping.remove(items);
				System.out.println(items);
				System.out.println("");

				break;

			case 3:
				System.out.println("Shopping List:");
				for (int i = 0; i < Shopping.size(); i++) {

					System.out.println(Shopping.get(i));
					System.out.println("");

				}
				break;

			case 4:
				System.out.println("Exiting program...");
				return;
			}
		}

	}

}
