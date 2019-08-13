package Question;

public class SingleChoice extends Question {
	    //选项
		String[] option;
		
		//单选标准答案
		int answer;
		//构造器
		
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
