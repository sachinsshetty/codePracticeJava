package com.sachin.businessgame;

import java.util.Map;

public class Player implements Comparable<Player> {

	int id;
	Map<Integer, HotelCellBlock> hotels;
	double currentAmount = 1000;
	double totalAmount;
	int position = 0;

	public Player(int id) {
		this.id = id;
	}

	public void updateAmount(double price) {
		currentAmount += price;

		// System.out.println(amount);
	}

	public void addHotel(int position, CellBlock cellBlock) {
		
		hotels.put(position, (HotelCellBlock)cellBlock);

	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public double getTotalAmount() {
		return currentAmount + hotels.size() * 200;
	}

	public void updatePosition(int position) {
		this.position += position;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", hotels=" + getHotelSize(hotels) + ", amount=" + currentAmount + "]";
	}

	private Integer getHotelSize(Map<Integer, HotelCellBlock> hotels) {
		return hotels == null ? 0 : hotels.size();
	}

	public int compareTo(Player currentPlayer) {
		if (this.getTotalAmount() > currentPlayer.getTotalAmount())
			return 1;
		else
			return -1;
	}

}