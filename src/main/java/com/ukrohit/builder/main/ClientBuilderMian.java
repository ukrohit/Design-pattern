package com.ukrohit.builder.main;

import com.ukrohit.builder.Laptop;

public class ClientBuilderMian {

	public static void main(String[] args) {
		Laptop laptopBuilder = new Laptop.LaptopBuilder("saeqw", "eqweqw", "ewqeqw").setIsgraphic(true).setWifi(true).build();

		System.out.println("ClientBuilderMian.main()" + laptopBuilder);
		
		
		Laptop laptopBuilder1 = new Laptop.LaptopBuilder("saeqw", "eqweqw", "ewqeqw").build();

		System.out.println("ClientBuilderMian.main()" + laptopBuilder1);
	}

}
