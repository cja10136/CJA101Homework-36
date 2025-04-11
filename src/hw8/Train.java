package hw8;

import java.util.*;

public class Train implements Comparable {
	private int number;
	private String type, start, dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public ArrayList getTrainInfo() {
		ArrayList trainInfo = new ArrayList();
		Collections.addAll(trainInfo, number, type, start, dest, price);
		return trainInfo;
	}
	
	public void setTrainInfo(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	public String toString() {
		String s = "火車資訊：" + number + " " + type + " " + start + " " + dest + " " + price;
		return s;
	}

	@Override
	public int compareTo(Object o) {
		Train other = (Train) o;
		if (this.number > other.number)
			return 1;
		else if(this.number < other.number)
			return -1;
		else
			return 0;
	}
}
