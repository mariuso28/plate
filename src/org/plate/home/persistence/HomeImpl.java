package org.plate.home.persistence;

import org.plate.domain.plate.persistence.PlateDao;
import org.plate.user.persistence.BaseUserDao;

public class HomeImpl implements Home {

	private BaseUserDao baseUserDao;
	private PlateDao plateDao;
	
	public HomeImpl()
	{
	}
	
	@Override
	public BaseUserDao getBaseUserDao() {
		return baseUserDao;
	}

	public void setBaseUserDao(BaseUserDao baseUserDao) {
		this.baseUserDao = baseUserDao;
	}

	@Override
	public PlateDao getPlateDao() {
		return plateDao;
	}

	public void setPlateDao(PlateDao plateDao) {
		this.plateDao = plateDao;
	}

}
