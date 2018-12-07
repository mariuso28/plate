package org.plate.rest;

import org.plate.json.ResultJson;
import org.springframework.web.bind.annotation.RequestMapping;

public interface RestAnonController {

	
	@RequestMapping(value = "/getSuccess")
	// PkfzResultJson contains message if success, message if fail
	public ResultJson getSuccess();
	
	
}