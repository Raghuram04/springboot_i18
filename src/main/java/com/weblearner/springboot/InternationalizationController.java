package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternationalizationController {

	@Autowired
	private MessageSource messageSource;

	@RequestMapping("/i18")
	public String welcomeMessage() {		
		return messageSource.getMessage("welcome.message", null, LocaleContextHolder.getLocale());
	}

}
