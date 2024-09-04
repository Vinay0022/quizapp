package com.project.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizapp.Question;
import com.project.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

@Autowired
QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

}
