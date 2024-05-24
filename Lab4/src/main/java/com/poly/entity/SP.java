package com.poly.entity;

import java.util.HashMap;
import java.util.Map;

import com.poly.model.Item;

public class SP {

	public static Map<Integer, Item> item = new HashMap<>();
	static {
		item.put(1, new Item(1, "Iphone", 23.0, 0, "ip.jpg"));
		item.put(2, new Item(2, "Samsung", 13.0, 0, "ss.jpg"));
		item.put(3, new Item(3, "Oppo", 20.0, 0, "pp.webp"));
		item.put(4, new Item(4, "Xiaomi", 19.0, 0, "xm.jpg"));
	}
}
