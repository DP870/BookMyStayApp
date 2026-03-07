package com.Room;
import java.util.*;
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
			

	}

	}
	}
}
