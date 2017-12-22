package com.sapient.test;

import java.util.Map;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.Idao;
import com.sapient.vo.Questions;

public class TestDao {

	public static void main(String[] args) {
		Idao dao = ExamDaoImpl.getDaoInstance();
		Map<Integer, Questions> map = dao.viewQuestions();
		System.out.println(map.size());

		Set<Integer> set = map.keySet();
		for (int qid : set) {
			Questions ques = map.get(qid);
			System.out.print(ques.getQid() + ". ");
			System.out.println(ques.getQdesc());
			System.out.println("a) " + ques.getOpta());
			System.out.println("b) " + ques.getOptb());
			System.out.println("c) " + ques.getOptc());
			System.out.println("---------------------------------");
		}

	}

}
