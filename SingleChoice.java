package Question;

public class SingleChoice extends Question {
	    //ѡ��
		String[] option;
		
		//��ѡ��׼��
		int answer;
		//������
		
		public SingleChoice(String text, String[] option, int answer) {
		    this.text = text;
			this.option = option;
			this.answer = answer;
		}
		
	
		@Override
		public boolean check(int[] answer) {
			return this.answer == answer[0];
			
		}
		
		
		
	
	
	
	
}
