package study_level1;

public class PRO12947_하샤드수 {
	public boolean solution(int x) {
		boolean answer = true;
		int num = x;
        int sum = 0;
        
        while(num!=0){
            sum += num%10;
            num = num/10;            
        }
                
        if(x%sum != 0){
            answer = false;
        }
        
        return answer;
    	}
	}