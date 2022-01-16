package study_level1;

import java.util.Arrays;

public class PRO12954_X만큼간격이있는N개의숫자 {

	public static void main(String[] args) {
		int x = 4;
		int n = 3;
		System.out.println(Arrays.toString(solution(x,n)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
//		long[] answer2 = new long[n];
		long num = x;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		return answer;
	}
}
