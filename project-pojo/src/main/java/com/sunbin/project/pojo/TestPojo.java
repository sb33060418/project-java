package com.sunbin.project.pojo;

public class TestPojo {
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

	private int id;
	private String name;

	@Override
	public String toString() {
		return "TestPojo [id=" + id + ", name=" + name + "]";
	}
}
