package com.a;

   //书的实现类

public class Book {
    public int id;
    public String name;
    public String type;
    public float price;
    public String publishingHouse;
    public String author;
    public int bookCount;
    public float dayMoney;
    public int flag=1;
    public Book(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public float getDayMoney() {
		return dayMoney;
	}
	public void setDayMoney(float dayMoney) {
		this.dayMoney = dayMoney;
	}
   
}
