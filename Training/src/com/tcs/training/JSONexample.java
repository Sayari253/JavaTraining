package com.tcs.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONexample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\iamsa\\eclipse-workspace\\Training\\resources\\weather.json"));
		JSONObject js = (JSONObject) obj; 
		JSONArray ja = (JSONArray)js.get("WeatherData");
		for(int i=0;i<ja.size();i++) {
			JSONObject outObject = (JSONObject) ja.get(i);
			System.out.println( "Date: "+outObject.get("date"));
			JSONArray array = (JSONArray)(outObject.get("City"));
			JSONObject kolkata = (JSONObject) array.get(0); // For Kolkata
			JSONObject weatherKol = (JSONObject) kolkata.get("weather");
			// Calculating chances of rain for Kolkata
			long humiKol = (long) weatherKol.get("humidity");
			if(humiKol>80)
				System.out.println("Kolkata: Chances of rain is high ");
			else if(humiKol>50 && humiKol<80)
				System.out.println("Kolkata: Chances of rain is medium");
			else
				System.out.println("Kolkata: Chances of rain is low");
			JSONObject mumbai = (JSONObject) array.get(1); // For Mumbai
			JSONObject weatherMum = (JSONObject) mumbai.get("weather");
			long humiMum = (long) weatherMum.get("humidity");
			//Calculating chances of rain for Mumbai
			if(humiMum>80)
				System.out.println("Mumbai: Chances of rain is high ");
			else if(humiMum>50 && humiMum<80)
				System.out.println("Mumbai: Chances of rain is medium");
			else
				System.out.println("Mumbai: Chances of rain is low");
			
			double tempKol = (double) weatherKol.get("temp_max");
			double tempMum =(double) weatherMum.get("temp_max");
			
			if(tempKol > tempMum)
				System.out.println("Kolkata is hottest today");
			else
				System.out.println("Mumbai is hottest today");
			
			System.out.println("------------------------------------");
			
		}
	}

}
