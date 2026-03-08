package com.Reservation;
import java.util.*;
// Queue Stores all the bookings in a queue.
public class QueueStructure {

    private final Queue<Reservation> bookings;

    public QueueStructure(){
        this.bookings = new LinkedList<>();
    }


    public synchronized void add(Reservation reservation) {
        bookings.add(reservation);
        System.out.println("Reservation Done !");
    }

  
    public synchronized void displayQueue() {
    	if (bookings.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            int position = 1;
            System.out.println("Reservation Queue:");
            for (Reservation res : bookings) {
                System.out.println(position + ". " + res.toString());
                position++;
            }
            System.out.println("");
        }

    }
}

