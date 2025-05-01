package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	/*
	 * 기본생성자는 필드가 생성되면 기본으로 만들어지지만
	 * 추가로 만들어진 생성자가 있다면 기본생성자는 만들어지지 않는다.
	 */
	
	public Goods() {
		
	}
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void showInfo() {
			System.out.println("상품명:" + name + ", 가격:" + price);
		}
		
	}
	





