package com.Room;
// This class defines the room type with the help of roomNo and roomType.
public class RoomType  {
	
	private int roomNo;
	private int roomTypeCode;
	private String roomType;
	
	public RoomType(int roomNo,int roomTypeCode,String roomType) {
		this.roomNo=roomNo;
		this.roomTypeCode=roomTypeCode;
		this.roomType=roomType;
		
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(int roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	
	
}
