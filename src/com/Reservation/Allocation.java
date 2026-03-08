package com.Reservation;
import java.util.*;
public class Allocation {

		private HashSet<Integer> occupied;
		private HashMap<String,Integer> assigned;
		
	
		public Allocation() {
			this.occupied=new HashSet();
			this.assigned=new HashMap();
		}
		public void assignRoom(Reservation res,int roomNo) {
			if (occupied.contains(roomNo)) {
				System.out.println("Room is already occupied/assigned.");
			} else {
				occupied.add(roomNo);
				assigned.put(res.getGuestName(), roomNo);
				System.out.println("Room assignment successful.");
			}
	}
		public void seeAssignment() {
			if (assigned.isEmpty()) {
				System.out.println("Allocations empty.");
			}
			else {
			    System.out.println("Assigned Room HashMap");
				for (String name:assigned.keySet()) {
					System.out.println("Guest Name: "+name+"Room No: "+assigned.get(name));
				}
			    System.out.println("");
			}
		}
	
}
