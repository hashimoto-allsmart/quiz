package com.allsmart.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

	@GetMapping(value = "/question")
	public ModelAndView get() {
		// モデル生成
		ModelAndView modelAndView = new ModelAndView();
		// 画面名設定
		modelAndView.setViewName("question");
		return modelAndView;
	}
}
