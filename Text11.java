    public class Text11{
        public static void Main(string[] args){
            int i, j, k;
            int sum = 0;
            for(i=1;i<10;i++)//i控制行
                for(j=0;j<10;j++)//j控制列
                    for (k = 0; k < 10; k++)
                    {
                        if ((i * 100 + j * 10 + k) == (i * i * i + k * k * k + j * j * j))
                        {
                            Console.WriteLine("{0}{1}{2}", i, j, k);
                            sum++;
                        }

                    }
            Console.WriteLine("{0}", sum);
        }
    }
