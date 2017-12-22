package com.sapien.service;

import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Questions;

public interface IExamSer {

	List<Questions> generateQuestionS();

	int evaluate(List<Answer> aList);

}
