/*
 Sahar Hazem Hatem Hmidat 
 1202038
 3L
 */
import java.util.Date;
import java.util.Random;

public class Chair {
	private double weight;
	private double distanceFromFrontWall;
	private String color;
	private Date dataManufactured;
	
	public Chair() {
		this(50.5,12,"White",new Date(122,11,15,13,37,22));
	}
	
	public Chair(double weight, double distanceFromFrontWall, String color, Date dataManufactured) {
	
		this.weight = weight;
		this.distanceFromFrontWall =distanceFromFrontWall ;
		this.color = color;
		this.dataManufactured = dataManufactured;
	}
	public double getWeight() {
		return weight; 
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDistanceFromFrontWall() {
		return distanceFromFrontWall;
	}
	public void setDistanceFromFrontWall(double distanceFromFrontWall) {
		this.distanceFromFrontWall = distanceFromFrontWall;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		
		this.color = color;
	}
	public Date getDataManufactured() {
		return dataManufactured;
	}
	public void setDataManufactured(Date dataManufactured) {
		this.dataManufactured =dataManufactured;
	}
	public void moveChairBackward(double distance) {
		distanceFromFrontWall+=distance;
		
	}
	public void moveChairForward(double distance) {
		distanceFromFrontWall-=distance;
		if(distanceFromFrontWall<0.0)
			distanceFromFrontWall=0;
		
	}
	
}
