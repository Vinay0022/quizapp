package com.project.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quizapp.Question;
import com.project.quizapp.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController{

    @Autowired
	QuestionService questionService;


	@GetMapping("allquestions")
public List<Question>getAllQuestions(){
return questionService.getAllQuestions();
}

	@GetMapping("all")
public String All(){
return "Hello";
	}


}
