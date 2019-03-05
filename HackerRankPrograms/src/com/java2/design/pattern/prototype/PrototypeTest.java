package com.java2.design.pattern.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Relation");
		bs.loadData();
		
	/*	BookShop bs2 = new BookShop();
		bs2.setShopName("Mayura");
		bs2.loadData();
		System.out.println(bs2);*/
		
		/*BookShop bs2 = (BookShop) bs.clone(); //shallow cloning
		bs2.setShopName("Mayura");
		//bs2.loadData();
		System.out.println(bs2);*/
		
		BookShop bs2 = bs.clone(); //deep cloning
		bs.getBooks().remove(2);
		bs2.setShopName("Mayura");
		//bs2.loadData();
		
		System.out.println(bs);
		System.out.println(bs2);
	}

}
