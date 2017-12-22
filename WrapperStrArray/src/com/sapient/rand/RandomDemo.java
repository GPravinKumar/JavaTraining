package com.sapient.rand;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomDemo {

	public static void main(String[] args) {
		System.out.println(gen5NOs());

	}

	public static Set<Integer> gen5NOs() {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		while (set.size() < 5)
			set.add(r.nextInt(15) + 1);
		return set;
	}

}
