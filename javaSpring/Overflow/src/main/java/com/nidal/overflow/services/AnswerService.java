package com.nidal.overflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nidal.overflow.models.Answer;
import com.nidal.overflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	public Answer createAnswer(Answer answer) {
		return answerRepository.save(answer);
	}
	public List<Answer> getAll() {
		return answerRepository.findAll();
	}

}