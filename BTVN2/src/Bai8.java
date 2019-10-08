import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so  a :");
		int a=sc.nextInt();
		System.out.println("Nhap so  b :");
		int b=sc.nextInt();
		System.out.println("Nhap so  c :");
		int c=sc.nextInt();
		int max=a;
		if(max<b)
		{
			max=b;
		}
		if(max<c)
		{max=c;
		
		}
		System.out.println("Max = "+max);
		int min=a;
		if(min>b)
		{
			min=b;
		}
		if(min>c)
		{
			min=c;
		
		}
		System.out.println("Min = "+min);
		
		

	}

}
