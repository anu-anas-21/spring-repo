package com.example.di;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techId;
	private String techName;
	
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	public void displayTech() {
		System.out.println("Technologies object created");
	}
}
