package org.plate.services;

import org.plate.home.persistence.Home;

public class Service {
	private Home home;

	public Service()
	{
	}

	public void initServices()
	{	
	}
	
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
}
