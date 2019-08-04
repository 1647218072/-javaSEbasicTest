public class Practice4 {
	public static void main(String[] args){
		int n = 56123;
		int m = 0;
		while(n>0){
			m = m*10 + n % 10;	// МоїХ
			n = n / 10;
		}		
		System.out.println(m);
	}
}
