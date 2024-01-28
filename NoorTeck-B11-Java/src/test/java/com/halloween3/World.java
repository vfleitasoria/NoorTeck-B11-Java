package com.halloween3;

public interface World {
	
	public World(String name) {//interface no have constructor
		System.out.println("Name: " + name);
	}
	
	public abstract void setRegion();
	public abstract void setOcean();
}

