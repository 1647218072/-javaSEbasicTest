package Question;

public class Text {
    public static void main(String[] args) {
    	// 构建多选题
    	MultiChoice mc = new  MultiChoice("您看中了哪些车？",new String[] {"1.夏利","2.五菱宏光","3.奥拓","4.吉利"} ,new int[] {1,2});  
    	int[] answer = new int[] {1,3};
    	boolean check = mc.check(answer);
    	System.out.println(check);
	    //构建单选题
    	SingleChoice sc	 =new SingleChoice("您要买哪辆车？",new String[] {"1.夏利","2.五菱宏光","3.奥拓","4.吉利"} ,3);
    	boolean check2 = sc.check(new int[] {3});
        System.out.println(check2);
    
    } 
    
	
	
	
	
}
