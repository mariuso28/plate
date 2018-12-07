package org.plate.rest;

import org.plate.json.ResultJson;
import org.plate.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/anon")
public class RestAnonControllerImpl implements RestAnonController {

	@Autowired
	Service service;
	
	@Override
	@RequestMapping(value = "/getSuccess")
	// PkfzResultJson contains message if success, message if fail
	public ResultJson getSuccess()
	{
		ResultJson result = new ResultJson();
		result.success("SUCCESS");
		return result;
	}
}
