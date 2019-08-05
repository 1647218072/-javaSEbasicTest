public class Text6{
public static void main(String[] args) {
int a[] = new int[]{1, 7, 9, 11, 13,15, 17,19};
int b[] = new int[]{2, 4, 6, 8,10};
int c[]=new int [13];//计算好数组c所需大小
System.arraycopy(a,0,c,0,8);//使用arraycopy方法
System.arraycopy(b,0,c,8,5);
for(int i=0;i<c.length;i++){
System.out.print(c[i]+" ");//循环遍历新数组
}
}
}