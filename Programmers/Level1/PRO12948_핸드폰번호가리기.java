package study_level1;

public class PRO12948_핸드폰번호가리기 {

	public String solution(String phone_number) {		 
		StringBuilder answer = new StringBuilder(phone_number);
			 
		for(int i = 0; i < phone_number.length()-4; i++) {
			answer.setCharAt(i, '*');
		}
		return answer.toString();
	    }
	}