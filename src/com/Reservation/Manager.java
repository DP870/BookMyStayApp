package com.Reservation;

import java.util.*;

public class Manager {
    // Maps Guest Name -> List of selected services
    private Map<String, List<String>> guestServices;
    private List<String> available;

    public Manager() {
        this.guestServices = new HashMap<>();
        //Services available
        this.available=Arrays.asList("Spa", "Breakfast", "WiFi", "Gym","Lunch","Beach Tour","City Tour");
    }

    public void addService(String name, String serviceName) {
        if (!available.contains(serviceName)) {
            System.out.println("Service is not available.");
            return;
        }

        
        
        
        guestServices.computeIfAbsent(name, k -> new ArrayList<>()).add(serviceName);
        System.out.println(serviceName+" added for "+name);
    
    
    }
//Displays the guest services
    public void displayGuestServices(String guestName) {
        if (guestServices.containsKey(guestName)) {
            System.out.println("Services for " + guestName + ": " + guestServices.get(guestName));
        } else {
            System.out.println("No extra services found for " + guestName);
        }
    }
    

    
    
    
}