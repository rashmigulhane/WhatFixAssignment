package com.whatfix.problem1.Util;

import java.util.ArrayList;
import java.util.List;

import com.whatfix.problem1.model.Thing;

public class ListFromStringCreator {
	private static final String COLAN = ":";
	private static final String CLOSING_BRACKET = "\\)";
	private static final String COMMA = ",";

	public List<Thing> createThingsList(String thingsEntry) {
		float maxCapacity = getMaxCapacity(thingsEntry);
		return getThingsObject(thingsEntry, maxCapacity);
	}

	public float getMaxCapacity(String thingsEntry) {
		String[] thingSplit = thingsEntry.split(COLAN);
		return Float.parseFloat(thingSplit[0].trim());
	}

	private List<Thing> getThingsObject(String thingsEntry, float maxCapacity) {
		String[] thingSplit = thingsEntry.split(COLAN);
		String[] thingsArray = thingSplit[1].split(CLOSING_BRACKET);
		List<Thing> listOfThing = new ArrayList<Thing>();

		for (String thing : thingsArray) {
			String[] thingElements = thing.split(COMMA);
			if (Float.parseFloat(thingElements[1]) <= maxCapacity) {
				listOfThing.add(createObjectFromString(thingElements));
			}
		}

		return listOfThing;
	}

	private Thing createObjectFromString(String[] thingElements) {
	   	Thing thing = new Thing(Integer.parseInt(thingElements[0].trim().substring(1,thingElements[0].length()-1)),
				Float.parseFloat(thingElements[1].trim()),
				Integer.parseInt(thingElements[2].trim().substring(1)));
		return thing;
	}
}
