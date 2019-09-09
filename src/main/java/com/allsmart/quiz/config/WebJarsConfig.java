package com.allsmart.quiz.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "webjars")
@Data
public class WebJarsConfig {
	private String bootstrap;
	private String jquery;
	private String popper;
	private String fontawesome;
	private String sockj;
	private String stomp;
}
