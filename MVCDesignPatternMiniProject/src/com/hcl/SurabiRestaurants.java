package com.hcl;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@SuppressWarnings("unused")
public class SurabiRestaurants {
		@SuppressWarnings({ "deprecation", "resource" })
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Date time=new Date();
			
			List<Bills> bills = new ArrayList<Bills>();
			boolean finalOrder;

			List<Items> items = new ArrayList<Items>();

			Items i1 = new Items(1, "Rajma Chawal", 2, 150.0);
			Items i2 = new Items(2, "Momos", 2, 190.0);
			Items i3 = new Items(3, "Red Thai Curry", 2, 180.0);
			Items i4 = new Items(4, "Chaap", 2, 190.0);
			Items i5 = new Items(5, "Chilli Potato", 1, 250.0);

			items.add(i1);
			items.add(i2);
			items.add(i3);
			items.add(i4);
			items.add(i5);

			System.out.println("Welcome to Surabi Restaurant");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			while (true) {
				System.out.println("Please Enter the Credentials");

				System.out.println("Email = ");
				String email = scanner.next();

				System.out.println("Password = ");
				String password = scanner.next();

				String name = Character.toUpperCase(password.charAt(0)) + password.substring(1);

				System.out.println("Please Enter A if you are Admin and U if you are User");
				String aorU = scanner.next();

				Bills bill = new Bills();
				List<Items> selectedItems = new ArrayList<Items>();
				
				double totalCost = 0;
				
				Date date=new Date();
				
				ZonedDateTime time1 = ZonedDateTime.now();
				DateTimeFormatter f = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss zzz yyyy");
				String currentTime = time1.format(f);

				if (aorU.equals("U") || aorU.equals("u")) {

					System.out.println("Welcome Mr. " + name);
					do {
						System.out.println("Today's Menu :- ");
						items.stream().forEach(i -> System.out.println(i));
						System.out.println("Enter the Menu Item Code");
						int code = scanner.nextInt();
						
						if (code == 1) {
							selectedItems.add(i1);
							totalCost += i1.getItemPrice();
						}

						else if (code == 2) {
							selectedItems.add(i2);
							totalCost += i2.getItemPrice();
						} else if (code == 3) {
							selectedItems.add(i3);
							totalCost += i3.getItemPrice();
						} else if (code == 4) {
							selectedItems.add(i4);
							totalCost += i4.getItemPrice();
						} else {
							selectedItems.add(i5);
							totalCost += i5.getItemPrice();
						}
						
						System.out.println("Press 0 to show bill"+'\n'+"Press 1 to order more");
						int opt = scanner.nextInt();
						if (opt == 0)
							finalOrder = false;
						else
							finalOrder = true;

					} while (finalOrder);
					

					System.out.println("Thanks Mr " + name + " for dining in with Surabi ");
					System.out.println("Items you have Selected");
					selectedItems.stream().forEach(e -> System.out.println(e));
					System.out.println("Your Total bill will be " + totalCost);
					System.out.println("Successfully logout.!");
					System.out.println();
					System.out.println("Welcome to Surabi Restaurants");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

					bill.setName(name);
					bill.setCost(totalCost);
					bill.setItems(selectedItems);
					bill.setTime(date);
					bills.add(bill);

				} else if (aorU.equals("A") || aorU.equals("a")) {
					System.out.println("Welcome Admin");
					System.out.println("Press 1 to see all the bills for today\n"
							+ "Press 2 to see all the bills for this month\n"
							+ "Press 3 to see all the bills");
					int option = scanner.nextInt();
					switch (option) {
					case 1:
						if ( !bills.isEmpty()) {
							for (Bills b : bills) {
								if(b.getTime().getDate()==time.getDate()) {
								System.out.println("Username :- " + b.getName());
								System.out.println("Items :- " + b.getItems());
								System.out.println("Total :- " + b.getCost());
								System.out.println("Date " + b.getTime()+'\n');
							}
							}
							System.out.println("Successfully logout.!");
							System.out.println();
						} else {
							System.out.println("No Bills today.!");
							System.out.println("Successfully logout.!");
							System.out.println();
						}
						break;

					case 2:
						if (!bills.isEmpty()) {
							for (Bills b : bills) {
								if (b.getTime().getMonth()==time.getMonth()) {
								System.out.println("Username :- " + b.getName());
								System.out.println("Items :- " + b.getItems());
								System.out.println("Total :- " + b.getCost());
								System.out.println("Date " + b.getTime()+'\n');
							}
							}
							System.out.println("Successfully logout.!");
							System.out.println();
						} else {
							System.out.println("No Bills for this month.!");
							System.out.println("Successfully logout.!");
							System.out.println();
						}
						break;

					case 3:
						if (!bills.isEmpty()) {
							for (Bills b : bills) {
								System.out.println("Username :- " + b.getName());
								System.out.println("Items :- " + b.getItems());
								System.out.println("Total :- " + b.getCost());
								System.out.println("Date " + b.getTime()+'\n');
							}
							System.out.println("Successfully logout.!");
							System.out.println();
						} else {
							System.out.println("No Bills.!");
							System.out.println("Successfully logout.!");
							System.out.println();
						}

						break;

					default:
						System.out.println("Invalid Option");
						System.out.println("Successfully logout.!");
						System.out.println();
						System.exit(1);
					}
					System.out.println("Welcome to Surabi Restaurants");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				} else  {
					System.out.println("Invalid Entry");
					System.out.println("Successfully logout.!");
					System.out.println();
					System.out.println("Welcome to Surabi Restaurants");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				}

			}

		}
	

}
