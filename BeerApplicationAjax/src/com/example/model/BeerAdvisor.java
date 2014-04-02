package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerAdvisor {
	
	public List<String> getBeerBrands(String color) {
		
		List<String> beerBrands = new ArrayList<String>();
		
		if(color.equals("Dark")) {
			beerBrands.add("Gulden Draak");
			beerBrands.add("Dogfish Head Raison d’Etre");
			beerBrands.add("St. Bernardus Abt 12");
		}
		else if(color.equals("Brown")) {
			beerBrands.add("Cigar City Mayan Espresso Bolita");
			beerBrands.add("Funky Buddha No Crusts");
			beerBrands.add("Cigar City Cubano-Style Espresso Brown Ale");
		}
		else if(color.equals("Amber")) {
			beerBrands.add("Maine Beer Zoe");
			beerBrands.add("AleSmith Evil Dead Red");
			beerBrands.add("AleSmith My Bloody Valentine");
		}
		else {
			beerBrands.add("Coors light");
			beerBrands.add("Bud light");
		}
		return beerBrands;		
		
		
	}

}
