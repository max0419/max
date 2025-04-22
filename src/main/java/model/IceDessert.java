package model;

import java.util.Date;

public class IceDessert {
	private String mainDish;
	private Date date;
	
	public IceDessert(String mainDish) {
		this.mainDish = mainDish;
		this.date = new Date();
	}
}
