package com.example.demo;

import java.util.ArrayList;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.example.demo.vo.*;

public class test {
	public static void main(String[] args) {
		String url = "https://finance.naver.com/sise/sise_market_sum.nhn?sosok=1&page=1";
		stockVo stockvo= new stockVo(); 
	
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			int i = 0;
			ArrayList red_data = new ArrayList();
			ArrayList name = new ArrayList();

			Elements els = doc.select("table[class=\"type_2\"]");
			els = els.select("tr");
			els = els.select("td[class=\"number\"]");
			
			Elements data_name = doc.select("table[class=\"type_2\"]");
			data_name = data_name.select("tr");
			data_name = data_name.select("td");
			data_name = data_name.select("a");
			
			

			for (Element e : els.select("span")) {
				if(e.text().contains("%")) {
					
					stockvo.setStock_name(data_name.text());
					stockvo.setStock_count(e.text());
					
					
					
					
					
					i++;	
				}
				else {
					continue;
				}
				
			}
			i = 0;
			
			
			

		} catch (Exception e) {

		}

	}
}

//red_data.add(e.text());
//name.add(data_name.text());