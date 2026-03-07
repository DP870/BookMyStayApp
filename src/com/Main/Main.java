package com.Main;
import java.util.*;

import com.Room.Memory;
import com.Room.RoomType;
import com.Room.*;


/*
 * Entry Point for the BookmyStayApp
 * @author Dhruv
 * @version 1.0
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		int ch=1;
		
		
		RoomType singleRoom=new RoomType(101,1,"Single");
		RoomType doubleRoom=new RoomType(201,2,"Double");
		RoomType thirdRoom=new RoomType(301,3,"Suite");
		Memory mem=new Memory();
		
		
		
		while (ch==1) {
			System.out.println("1. Check count and price of rooms");
			System.out.println("2. Update Room Count");
			System.out.println("3. Update Room Price");
			System.out.println("4. Search Room Availability");
			
			
			
			System.out.println("Choice: ");
			int ch2=sc.nextInt();
			
			if (ch2==1) {
				
				mem.find(); //Prints the count of the room.
				
		}	else if (ch2==2) {
			
			System.out.println("Enter the room type: ");
			String roomCode=sc.next();
			
			System.out.println("Enter the updated value: ");
			int newcount=sc.nextInt();
			mem.updateCount(roomCode,newcount);
			System.out.println("System Updated");
			
			
			
		}	else if (ch2==2) {
			
			System.out.println("Enter the room type: ");
			String roomCode=sc.next();
			
			System.out.println("Enter the updated price: ");
			int newcount=sc.nextInt();
			mem.updateCount(roomCode,newcount);
			System.out.println("System Updated");
			

	}	else if (ch==3) {
		System.out.println("Enter the room type: ");
		String type=sc.next();
		mem.search(type);
        }
		
	}

	}
	}

