package study_level1;

public class PRO12943_콜라츠추측 {
	public int solution(long num) {
		int answer = 0;
		long a = num;
		
		while(a != 1 && answer != 500) { //1이 아니거나 500이 아닐때까지 반복
			if(a%2==0) {
				a/=2;
			} else {
				a=(a*3) + 1;
			}
			answer++;
		}
		if(answer == 500) {
			answer = -1;
		}
		
		return answer;
	}
}
