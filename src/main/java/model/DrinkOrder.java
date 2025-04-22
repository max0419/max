package model;

import java.util.Map;

public class DrinkOrder  {
	private String type;
	private String size;
	private int price;
	private boolean ice;
	
	// 價格對照表
	private static final Map<String, Map<String, Integer>> priceTable = Map.of(
		    "greenTea", Map.of("S", 30, "M", 50, "L", 50),
		    "blackTea", Map.of("S", 45, "M", 55, "L", 65),
		    "milkTea", Map.of("S", 40, "M", 45, "L", 60));
	
	private static final Map<String, String> sizeTable = Map.of("S", "小", "M", "中", "L", "大");
	private static final Map<Boolean, String> iceTable = Map.of(true, "加冰", false, "去冰");
	
	public DrinkOrder(String type, String size, String ice) {
		this.type = type;
		this.size = size;
		this.ice = Boolean.parseBoolean(ice);
		this.price = priceTable.get(type.toLowerCase()).get(size);
	}
	
	public String getInfo() {
		String sizeText = sizeTable.get(size.toUpperCase());
		String iceText = iceTable.get(ice);	
		return String.format("您點了一杯 %s杯 %s 咖啡（%s）價格：%d 元", sizeText, type, iceText, price);
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}

	public boolean isSugar() {
		return ice;
	}

	public int getPrice() {
		return price;
	}

	public static Map<String, Map<String, Integer>> getPricetable() {
		return priceTable;
	}

	public static Map<String, String> getSizetable() {
		return sizeTable;
	}

	public static Map<Boolean, String> getSugartable() {
		return iceTable;
	}
	
	
	
}