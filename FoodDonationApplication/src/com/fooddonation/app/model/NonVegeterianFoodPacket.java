package com.fooddonation.app.model;

import com.fooddonation.app.state.AddFoodPacketState;
import com.fooddonation.app.state.PickupFoodPacketState;
import com.fooddonation.app.state.RemoveFoodPacketState;

public class NonVegeterianFoodPacket extends FoodPacket {

	public NonVegeterianFoodPacket(int size, int quantity, String foodType, boolean nutsIncluded) {
		this.type = "NON-VEG";
		this.size = size;
		this.quantity = quantity;
		this.foodType = foodType;
		this.nutsIncluded = nutsIncluded;
		this.addFoodPacketState = new AddFoodPacketState(this);
		this.pickupFoodPacketState = new PickupFoodPacketState(this);
		this.removeFoodPacketState = new RemoveFoodPacketState(this);

		this.state = addFoodPacketState;

	}

}
