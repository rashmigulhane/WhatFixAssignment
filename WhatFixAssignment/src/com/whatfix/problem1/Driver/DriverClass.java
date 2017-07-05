package com.whatfix.problem1.Driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.whatfix.problem1.Util.ListFromStringCreator;
import com.whatfix.problem1.Util.SortList;
import com.whatfix.problem1.algo.ListProcessor;
import com.whatfix.problem1.model.Thing;

public class DriverClass {

	public static void main(String args[]) throws IOException {

		BufferedReader bufferedReader = readDetailsFromFile();
		String record;
		while ((record = bufferedReader.readLine()) != null) {
			ListFromStringCreator listFromStringCreator = new ListFromStringCreator();
			List<Thing> thingsList = listFromStringCreator
					.createThingsList(record);
			float maxCapacity = listFromStringCreator.getMaxCapacity(record);
			SortList.order(thingsList);
			String result = ListProcessor.extractRequired(maxCapacity,
					thingsList);
			System.out.println(result);
		}
	}

	private static BufferedReader readDetailsFromFile() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Kidnly Enter the name of the absolute path of the file");
		String filePath = sc.next();
		File file = new File(filePath);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		return new BufferedReader(fileReader);
	}

}
