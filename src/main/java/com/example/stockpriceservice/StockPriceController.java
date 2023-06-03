package com.example.stockpriceservice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockPriceController {
	
	@GetMapping("/get-prices")
	public LinkedHashMap<String, Object> getStockPrices(){
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("code", 101);
		map.put("message", "Stocks fetched successfully with prices.");
		
		TreeMap<String, Double> stocks= new TreeMap<String, Double>();
		stocks.put("AAPL", 165.12);
		stocks.put("NKE", 136.55);
		stocks.put("YHOO", 122.22);
		stocks.put("ORCL", 75.97);
		stocks.put("TWTR", 35.55);
		
		map.put("code", 101);
		map.put("message", stocks.size()+" Stocks fetched successfully with prices.");
		map.put("stocks", stocks);
		
		return map;
	}
}
