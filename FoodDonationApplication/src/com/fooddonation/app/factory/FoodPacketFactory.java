package com.fooddonation.app.factory;

import com.fooddonation.app.model.FoodPacket;
import com.fooddonation.app.model.NonVegeterianFoodPacket;
import com.fooddonation.app.model.VegeterianFoodPacket;

public class FoodPacketFactory {

	public static FoodPacket getFoodPacket(String type, int size, int quantity, String foodType, boolean nutsIncluded) {
		FoodPacket foodPacket = null;

		if (type.equalsIgnoreCase("VEG")) {
			foodPacket = new VegeterianFoodPacket(size, quantity, foodType, nutsIncluded);
		} else if (type.equalsIgnoreCase("NON-VEG")) {
			foodPacket = new NonVegeterianFoodPacket(size, quantity, foodType, nutsIncluded);
		}

		return foodPacket;
	}
}
