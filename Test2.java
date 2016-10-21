public class Test2{
	public static void main(String[] args) {
		tables();
	}


	public static void printTrueAndFalse(boolean a[][])
	{
		int M = a.length;
		int N = a[0].length;
		StdOut.printf(" ");
		for(int i = 0; i < N; i++)
			StdOut.printf("%d", i + 1);
		StdOut.printf("\n");
		for(int i = 0; i < M;i++){
			StdOut.printf("%d",i +1);
			for (int j = 0; j < N; j++) {
				if(a[i][j] == true) StdOut.printf("*");
				else if(a[i][j] == false) StdOut.printf("#");
			}
			StdOut.printf("\n");
		}
		
	}


	public static int returnMaxLog(int n)
	{
		int i = 0;
		int m = 1;
		m *= 2;
		while(m <= n){
			m *= 2;
			i++;
		}
		return i;
	}
	// input [1,2,3,4,5] 3
	public static int[] histogram(int a[] ,int m) 
	{
		int[] l= new int[m];
		for(int i = 0; i < m; i++){
			for(int n = 0; n < a.length; n++){
				if(i == a[n]){
					l[i]++;
					// StdOut.printf("#l[%d] is %d ",i,l[i]);
				} 
			}
		}
		return l;
	}
	public static  String exR1(int n)
	{
		if(n <= 0) return "";
		return exR1(n - 3) + n + exR1(n -2) +n;
	}


	public static long Fibonacci(int n)
	{
		if(n == 0) return  0;
		if(n == 1) return 1;
		return  Fibonacci(n-1) + Fibonacci(n-2);
	}


	public static double Ln(int n)
	{
		if( n == 1) 
			return  Math.log(1);
		return Math.log(n) + Ln(n -1);
	}

	public static void tables(String[] args)
	{
		int L = 100;
		String[] a = new String[L];
		int[] b = new int[L];
		int[] c = new int[L];
		for(int i = 0; !StdIn.isEmpty();i++)
			for (int j = 0; j < 3; j++) {
				if (j == 0) a[i] = StdIn.readString();
				else if(j == 1) b[i] = StdIn.readInt();					
				else if(j == 2) c[i] = StdIn.readInt();
			}

		for (int m = 0; m < i; m++) {
			StdOut.printf("%s ",a[m]);
			StdOut.printf("%d ",b[m]);
			StdOut.printf("%d\n",c[m]);
		}
		
	}
}