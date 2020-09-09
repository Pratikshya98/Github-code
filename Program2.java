public class Main 
	{
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int d1=sc.nextInt();
        int[]arr=new int[d1];
		int t1=1;
		arr[0]=t1;
		for(int i=1;i<d1;i++)
		{
			t1=t1+2;
			arr[i]=t1;
        }
		for(int x:arr)
        System.out.println(x);
	
	}
	}
}
