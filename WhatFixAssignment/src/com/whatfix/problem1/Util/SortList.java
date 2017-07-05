package com.whatfix.problem1.Util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.whatfix.problem1.model.Thing;

public class SortList {

	public static void order(List<Thing> thingList) {

		Collections.sort(thingList, new Comparator<Thing>() {

			@Override
			public int compare(Thing o1, Thing o2) {

				float x1 = ((Thing) o1).getCost();
				float x2 = ((Thing) o2).getCost();
				int sComp = Float.compare(x2, x1);

				if (sComp != 0) {
					return sComp;
				} else {
					float w1 = ((Thing) o1).getWeight();
					float w2 = ((Thing) o2).getWeight();
					return Float.compare(w1, w2);
				}
			}
		});
	}
}
