/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */

import java.util.Random;

public class Room {
	private int number;
	private double width;
	private double length;
	private Chair []chairs;
	
	public Room(int number, double width,double length, Chair[] chairs) {
		this.number = number;
		this.width = width;
		this.length = length;
		this.chairs = chairs;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Chair[] getChairs() {
		return chairs;
	}
	public void setChairs(Chair[] chairs) {
		this.chairs = chairs;
	}
	
	private int countChairsByColor(String targetColor) {
        int count = 0;
        for (Chair chair : chairs) {
            if (chair.getColor().equalsIgnoreCase(targetColor)) {
                count++;
            }
        }
        return count;
    }
	
	 public void displayRoomInfo() {
		 
		 System.out.printf("%d\t%.2f\t%.2f\t    %d\t\t%d\t%d\t%d",number,length,width,chairs.length,countChairsByColor("Red"),countChairsByColor("White"),countChairsByColor("Yellow"));
		 System.out.println();
	 }
	 
}
