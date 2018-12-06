package org.plate.home.persistence;

import org.plate.domain.plate.persistence.PlateDao;
import org.plate.user.persistence.BaseUserDao;

public interface Home {
	
	public BaseUserDao getBaseUserDao();
	public PlateDao getPlateDao();

}
