package com.fooddonation.app;

import java.util.Scanner;

import com.fooddonation.app.factory.FoodPacketFactory;
import com.fooddonation.app.model.FoodCenter;
import com.fooddonation.app.model.FoodPacket;

public class FoodDonationApplication {

	public static void main(String[] args) {

		System.out.printf("**************************************************************\n");
		System.out.printf("WELCOME TO FOOD DONATION APPLICATION");
		System.out.printf("**************************************************************\n");

		Scanner scanner = new Scanner(System.in);
		FoodCenter foodCenter = new FoodCenter();

		do {

			System.out.println("Main Menu: ");
			System.out.println("1.Food Donor");
			System.out.println("2.Food Reciever");
			System.out.println("3.Exit");

			System.out.println("Choose one to proceed");

			int mainMenuOption = scanner.nextInt();

			switch (mainMenuOption) {

			case 1:
				System.out.println("Food Donor Menu: ");
				System.out.println("1.Add Veg Breakfast");
				System.out.println("2.Add Veg Lunch");
				System.out.println("3.Add Veg Dinner");
				System.out.println("4.Add Non-Veg Breakfast");
				System.out.println("5.Add Non-Veg Lunch");
				System.out.println("6.Add Non-Veg Dinner");
				System.out.println("Choose one to proceed");
				int foodDonorOption = scanner.nextInt();

				switch (foodDonorOption) {
				case 1:
					FoodPacket vegBreakFastPacket = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Breakfast", true);
					vegBreakFastPacket.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(vegBreakFastPacket);
					foodCenter.getVegFoodPackets().add(vegBreakFastPacket);
					
					break;
				case 2:
					FoodPacket vegLunch = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Lunch", false);
					vegLunch.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(vegLunch);
					foodCenter.getVegFoodPackets().add(vegLunch);
					
					break;
				case 3:
					FoodPacket vegDinner = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Dinner", false);
					vegDinner.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(vegDinner);
					foodCenter.getVegFoodPackets().add(vegDinner);
					
					break;
				case 4:
					FoodPacket nonvegBreakFastPacket = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Breakfast",
							false);
					nonvegBreakFastPacket.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(nonvegBreakFastPacket);
					foodCenter.getNonVegFoodPackets().add(nonvegBreakFastPacket);
					
					break;
				case 5:
					FoodPacket nonvegLunch = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Lunch", true);
					nonvegLunch.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(nonvegLunch);
					foodCenter.getNonVegFoodPackets().add(nonvegLunch);
					
					break;
				case 6:
					FoodPacket nonvegDinner = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Dinner", true);
					nonvegDinner.addFoodPacket();
					foodCenter.getAvailablefoodPackets().add(nonvegDinner);
					foodCenter.getNonVegFoodPackets().add(nonvegDinner);
					
					break;

				}

				break;
			case 2:
				System.out.println("Food Reciever Menu: ");
				System.out.println("1.Get All from Food Center");
				System.out.println("2.Get All Veg from Food Center");
				System.out.println("3.Get All Non-Veg from Food Center");
				System.out.println("4.Select Veg Food");
				System.out.println("5.Select Non Veg Food");

				System.out.println("Choose one to proceed");
				int foodRecieverOption = scanner.nextInt();

				switch (foodRecieverOption) {
				case 1:
					System.out.println(
							"Total Number of Food Packets Available " + foodCenter.getAvailablefoodPackets().size());
					break;
				case 2:
					System.out.println(
							"Total Number of Veg Food Packets Available " + foodCenter.getVegFoodPackets().size());
					break;
				case 3:
					System.out.println("Total Number of Non-Veg Food Packets Available "
							+ foodCenter.getNonVegFoodPackets().size());
					break;
				case 4:
					if (foodCenter.getVegFoodPackets().isEmpty()) {
						System.out.println("No Veg Packets available");
					} else {
						System.out.println("Selected Vegetarian Food ");
						FoodPacket vegfp = foodCenter.getVegFoodPackets().remove(0);

						if (vegfp != null) {
							foodCenter.getAvailablefoodPackets().remove(vegfp);
							vegfp.removeFoodPacket();
						}

					}
					break;
				case 5:
					if (foodCenter.getNonVegFoodPackets().isEmpty()) {
						System.out.println("No Non Veg Packets available");
					} else {
						System.out.println("Selected Non-Vegetarian Food ");
						FoodPacket nonvegfp = foodCenter.getNonVegFoodPackets().remove(0);

						if (nonvegfp != null) {
							foodCenter.getAvailablefoodPackets().remove(nonvegfp);
							nonvegfp.removeFoodPacket();
						}
					}
					break;
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Option");
				break;

			}

			if (mainMenuOption == 3) {
				break;
			}

		} while (true);

		System.out.println("THANK YOU FOR USING THE FOOD DONATION APP");

	}

}
