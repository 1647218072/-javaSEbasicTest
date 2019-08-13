package Question;

import java.util.Arrays;

public class MultiChoice extends Question {
    //ѡ��
	String[] option;
	
	//��ѡ��׼��
	int[] answer;
    //������
	public MultiChoice(String text,String[] option, int[] answer) {
	    this.text = text;
		this.option = option;
		this.answer = answer;
	}
	
	@Override
	public boolean check(int[] as) {
		//�жϴ��Ƿ�Ϊnull
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
