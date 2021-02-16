package com.ukrohit.builder;



/**
 * @author Umesh Rohit
 * 
 * this builder  design pattern use to create object with mandatory field and optional field 
 *
 */
public class Laptop {

	private String ram;
	private String memory;
	private String processor;
	private boolean isWifi;
	private boolean isgraphic;

	private Laptop(LaptopBuilder laptopBuilder) {

		this.ram = laptopBuilder.ram;
		this.memory = laptopBuilder.memory;
		this.processor = laptopBuilder.processor;
		this.isWifi = laptopBuilder.isWifi;
		this.isgraphic = laptopBuilder.isgraphic;
	}

	public static class LaptopBuilder {

		private String ram;
		private String memory;
		private String processor;
		private boolean isWifi;
		private boolean isgraphic;

		public LaptopBuilder(String ram, String memory, String processor) {
			super();
			this.ram = ram;
			this.memory = memory;
			this.processor = processor;
		}

		public LaptopBuilder setWifi(boolean isWifi) {
			this.isWifi = isWifi;
			return this;
		}

		public LaptopBuilder setIsgraphic(boolean isgraphic) {
			this.isgraphic = isgraphic;
			return this;
		}

		public Laptop build() {
			return new Laptop(this);
		}
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", memory=" + memory + ", processor=" + processor + ", isWifi=" + isWifi
				+ ", isgraphic=" + isgraphic + "]";
	}
	
	

}
