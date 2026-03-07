package com.Room;
import java.util.*;

public class Memory {

	    
	    private final Map<String, Integer> count;
	    private final Map<String, Double>	price;

public Memory() {
	        this.count = new HashMap<>();
	        this.price = new HashMap<>();
	        
	        count.put("Single", 10);
	        count.put("Double", 10);
	        count.put("Suite", 10);
	        
	        price.put("Single", 100.0);
	        price.put("Double", 200.0);
	        price.put("Suite", 500.0);
	    }
public void updateCount(String type, int c) {
	        if (count.containsKey(type)) {
	            count.put(type, c);
	        } else {
	            System.out.println("Room not found");
	        }
	    }
public void updatePrice(String type, double p) {
    if (count.containsKey(type)) {
        price.put(type, p);
    } else {
        System.out.println("Room not found !");
    }
}
public void find() {
	        System.out.println("Current Room Inventory");
	        for (String type :count.keySet()) {
	            int c1 = count.get(type);
	            double p1 = price.get(type);
	            System.out.println("Count of "+type+" Rooms: " + c1 );
	            System.out.println("Price of "+type+" Room:" + p1);
	        }
	    
	    }

public void search(String type) {
        for (String match :count.keySet()) {
        	if (match.equals(type)) {
        int c1 = count.get(type);
        double p1 = price.get(type);
        System.out.println("Count of "+type+" Rooms: " + c1 );
        System.out.println("Price of "+type+" Room:" + p1);
    }
        }

}
	
	 
	 
	    
	    
}


