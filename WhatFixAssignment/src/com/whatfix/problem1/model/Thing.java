package com.whatfix.problem1.model;

public class Thing {
	private final int index_number;
	private final float weight;
	private final int cost;
	
	public Thing(int index_number, 
			float weight,
			int cost ) {
		this.index_number = index_number;
		this.weight = weight;
		this.cost = cost;
	}

	public int getIndex_number() {
		return index_number;
	}

	public float getWeight() {
		return weight;
	}

	public int getCost() {
		return cost;
	}
}
