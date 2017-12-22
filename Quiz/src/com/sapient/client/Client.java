package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapien.service.ExamSerImpl;
import com.sapien.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Questions;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Start Quiz");
		IExamSer ser = ExamSerImpl.getInstance();
		List<Questions> lst = ser.generateQuestionS();
		List<Answer> aList = new ArrayList<Answer>();
		Answer answer = null;
		int i = 0;
		for (Questions ques : lst) {
			System.out.println(++i + ".  " + ques.getQdesc());
			System.out.println("a) " + ques.getOpta());
			System.out.println("b) " + ques.getOptb());
			System.out.println("c) " + ques.getOptc());
			String ans = scan.nextLine();
			answer = new Answer(ques.getQid(), ans);
			aList.add(answer);
			System.out.println("-----------------------------------");
		}
		int score = ser.evaluate(aList);
		System.out.println("Your Score is " + score);
		scan.close();
	}

}
