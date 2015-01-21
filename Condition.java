package edu.olivet.se532;

public class Condition {
	private String primary;
	private String second;
	public static final int NEW = 100;
	public static final int USED = 50;
	public static final int LIKE_NEW = 10;
	public static final int VERY_GOOD = 5;
	public static final int GOOG = 5;
	public static final int ACCEPTABLE = 0;
	private int primaryValue;
	private int secondValue;
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public int getPrimaryValue() {
		return primaryValue;
	}
	public void setPrimaryValue(int primaryValue) {
		this.primaryValue = primaryValue;
	}
	public int getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}
	
}
