import java.util.Scanner;


public class Bai2 {

	static int n;
	static float []a = new float[100];
	
	public static void NhapMang(float []a,int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập n:");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(" a[] = "+"  ");
			a[i]=sc.nextFloat();
		}
	}
	public static void sapxep(float []a,int n)
	{
		float temp=(int) a[0];
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
					
				}
			}
	
	
	public static void hienthi(float []a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
 public static void main(String[] args) {
	 
 
	 NhapMang(a,n);
	 sapxep(a, n);
	 hienthi(a,n);
 }
	


}
