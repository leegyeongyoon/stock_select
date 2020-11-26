package com.example.demo.vo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;

@Repository
//lombok 적용시
@Getter
@Setter
public class stockVo {
	
		@Autowired
		private String stock_name  ; 
		private String  stock_count ;
		
		public String getStock_name() {
			return stock_name;
		}
		public void setStock_name(String stock_name) {
			this.stock_name = stock_name;
		}
		
		public String getStock_count() {
			return stock_count;
		}
		public void setStock_count(String stock_count) {
			this.stock_count = stock_count;
		}  
		
		
}
