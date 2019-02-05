/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExcuteCmdService;

/**
 * @author vamshidhar
 *
 */
@RestController
@RequestMapping("/excute")
public class ExcuteCmdController {
	
	@Autowired
	private ExcuteCmdService excuteCmdService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void excuteScriptFile() {
		excuteCmdService.excuteCmdScript(); 
	}

}
