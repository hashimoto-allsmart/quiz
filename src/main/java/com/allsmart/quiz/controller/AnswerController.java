package com.allsmart.quiz.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.allsmart.quiz.model.Respondent;
import com.allsmart.quiz.model.RightToAnswer;

@Controller
public class AnswerController {

	@MessageMapping("/answer")
	@SendTo("/result")
	public RightToAnswer press(Respondent respondent) throws Exception {
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		// 回答権があるかを判定
		return new RightToAnswer(respondent.getId(), respondent.getName());
	}
}
