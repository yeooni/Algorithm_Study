package study_level1;

public class PRO12944_평균구하기 {

	public double solution(int[] arr) {
		double answer = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = sum / arr.length;
		return answer;
	}

}

/*
 * 1. 배열 arr의 합과 평균을 구할 변수 answer과 sum을 double(실수 타입)로 선언 - 연산을 위해서는 초기값을
 * 선언해줘야하기에 0으로 선언
 * 
 * 2. for문을 사용하여 변수 sum에 arr 배열 원소의 값을 더함
 * 
 * 3. 평균의 변수인 answer를 구하기 위해 배열 원소의 합 sum을 배열의 길이(arr.length)만큼 나눔
 * 
 * 4. return을 사용하여 answer을 반환
 */