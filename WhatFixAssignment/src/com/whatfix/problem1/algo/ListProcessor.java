package com.whatfix.problem1.algo;

import java.util.List;

import com.whatfix.problem1.model.Thing;

public class ListProcessor {
	private static final String COMMA = ",";
	private static final String HYPEN = "-";

	public static String extractRequired(float maxCapacity,
			List<Thing> thingsList) {
		String result = "";
		float existingWeight = maxCapacity;
		for (Thing thing : thingsList) {
			if ((existingWeight - thing.getWeight()) >= 0) {
				result = result + thing.getIndex_number() + COMMA;
				existingWeight = existingWeight - thing.getWeight();
			}
		}
		if (result != "") {
			return result.substring(0, result.length() - 1);
		} else {
			return HYPEN;
		}
	}
}
