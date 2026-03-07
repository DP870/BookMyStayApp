package com.Reservation;
// This class deals with reservation of the different rooms
public class Reservation {
    private final String guestName;
    private final String roomType;
    private final long timestamp;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
     
        this.timestamp = System.currentTimeMillis();
    }

    public String getGuestName() {
        return guestName;
    }


    public String getRoomType() {
        return roomType;
    }

    @Override
    public String toString() {
        return "[Request] Guest: " + guestName + " | Room: " + roomType + " | Time: " + timestamp;
    }
}

