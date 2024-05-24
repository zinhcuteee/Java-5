package com.poly.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.poly.entity.SP;
import com.poly.model.Item;


@SessionScope
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	Map<Integer, Item> map = new HashMap<>();

	@Override
	public Item add(Integer id) {
		// TODO Auto-generated method stub
		Item item = map.get(id);
		if (item == null) {
			item = SP.item.get(id);
			item.setQty(1);
			map.put(id, item);
		} else {
			item.setQty(item.getQty() + 1);
		}
		return item;
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub

		map.remove(id);
	}

	@Override
	public Item update(Integer id, String qty) {
		// TODO Auto-generated method stub
		Item item = map.get(id);
		if (qty.equals("dis") && item.getQty() > 0) {
			item.setQty(item.getQty() - 1);
		} else if (qty.equals("plus") && item.getQty() < 100) {
			item.setQty(item.getQty() + 1);
		}
		return item;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		map.clear();
	}

	@Override
	public Collection<Item> getItems() {
		// TODO Auto-generated method stub

		return map.values();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub

		return map.values().stream().mapToInt(item -> item.getQty()).sum();
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return map.values().stream().mapToDouble(item -> item.getPrice() * item.getQty()).sum();
	}
}
