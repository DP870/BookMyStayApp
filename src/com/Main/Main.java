package com.Main;
import java.util.*;

import com.Inventory.Memory;
import com.Reservation.Allocation;
import com.Reservation.QueueStructure;
import com.Reservation.Reservation;
import com.Room.*;


/*
 * Entry Point for the BookmyStayApp
 * @author Dhruv
 * @version 3.0
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Allocation allocation=new Allocation();
		QueueStructure requestsQueue=new QueueStructure();
		
		int ch=1;
		
		// Intializing different objects
		RoomType singleRoom=new RoomType(101,1,"Single");
		RoomType doubleRoom=new RoomType(201,2,"Double");
		RoomType thirdRoom=new RoomType(301,3,"Suite");
		
		Memory mem=new Memory();
		
		
		
		while (ch==1) {
			System.out.println("1. Check count and price of rooms");
			System.out.println("2. Update Room Count");
			System.out.println("3. Update Room Price");
			System.out.println("4. Search Room Availability");
			System.out.println("5. Add Reservation to  Queue");
			System.out.println("6. Make Reservation");
			
			
			System.out.println("Choice: ");
			int ch2=sc.nextInt();
			
			if (ch2==1) {
				
				mem.find(); //Prints the count of the room.
				
		}	else if (ch2==2) {  //Updates the count of the room
			
			System.out.println("Enter the room type: ");
			String roomCode=sc.next();
			
			System.out.println("Enter the updated count: ");
			int newcount=sc.nextInt();
			mem.updateCount(roomCode,newcount);
			System.out.println("System Updated");
			
			
			
		}	else if (ch2==3) {    //Updates the price of the room
			
			System.out.println("Enter the room type: ");
			String roomCode=sc.next();
			
			System.out.println("Enter the updated price: ");
			int newcount=sc.nextInt();
			mem.updateCount(roomCode,newcount);
			System.out.println("System Updated");
			

	}	else if (ch==4) {
		System.out.println("Enter the room type: ");
		String type=sc.next();
		mem.search(type);
        }
	else if (ch==5) {     //
		 System.out.print("\nEnter Booking Name: ");
	        String name = sc.next();
	        
	        System.out.print("Enter Room Type: ");
	        String roomType = sc.next();
	        
	
	        if (!mem.exist(roomType)) {
	            System.out.println("Room Type does not exist");
	            
	        }
	        else {
	        	

	        Reservation request = new Reservation(name, roomType);
	        requestsQueue.add(request);
	        }
	    }
	else if (ch==6) {
		System.out.print("Enter Booking Name: ");
        String name = sc.next();
        
        System.out.print("Enter Room Type: ");
        String roomType = sc.next();
        
        System.out.print("Enter Room Number: ");
        int no = sc.nextInt();
        
        Reservation res = new Reservation(name, roomType);
        allocation.assignRoom(res, no);
	}
	}
		
	}

	}
	

