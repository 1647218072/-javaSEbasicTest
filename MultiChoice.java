package Question;

import java.util.Arrays;

public class MultiChoice extends Question {
    //选项
	String[] option;
	
	//多选标准答案
	int[] answer;
    //构造器
	public MultiChoice(String text,String[] option, int[] answer) {
	    this.text = text;
		this.option = option;
		this.answer = answer;
	}
	
	@Override
	public boolean check(int[] as) {
		//判断答案是否为null
		if (answer != null && as.length == answer.length) {
		 Arrays.sort(as);
			for(int i=0;i<as.length;i++) {
				if(as[i] != answer[i]) {
					return false;
				}
			}
			
			
		}
		return true;	
		
	}
	
	
}
