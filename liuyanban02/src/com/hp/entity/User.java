package com.hp.entity;

public class User {
	public Integer id;
	public String name;
	public String title;
	public String context;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public User(Integer id, String name, String title, String context) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.context = context;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", title=" + title
				+ ", context=" + context + "]";
	}
	
}
