package com.sapien.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.Idao;
import com.sapient.vo.Answer;
import com.sapient.vo.Questions;

public class ExamSerImpl implements IExamSer {

	private static IExamSer ser = new ExamSerImpl();

	private static Map<Integer, Questions> qmap;

	static {
		Idao dao = ExamDaoImpl.getDaoInstance();
		qmap = dao.viewQuestions();
	}

	private ExamSerImpl() {

	}

	public static IExamSer getInstance() {
		return ser;
	}

	@Override
	public List<Questions> generateQuestionS() {
		List<Questions> lst = new ArrayList<Questions>();
		Set<Integer> qids = generateQuesNos(5);
		Questions ques = null;
		for (int qno : qids) {
			ques = qmap.get(qno);
			lst.add(ques);
		}
		return lst;
	}

	@Override
	public int evaluate(List<Answer> aList) {
		int score = 0;
		Questions ques = null;
		for (Answer answer : aList) {
			ques = qmap.get(answer.getQid());
			if (ques.getAnswer().equalsIgnoreCase(answer.getAnswer()))
				++score;
		}
		return score;
	}

	public Set<Integer> generateQuesNos(int n) {
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		while (set.size() < n)
			set.add(r.nextInt(15) + 1);
		return set;
	}

}
