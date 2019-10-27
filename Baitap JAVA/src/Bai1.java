import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Nhap chuoi : ");
		a=sc.nextLine();
		int dem=0,s=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(a.charAt(i))&&((a.charAt(i)-48)%2==0)) {
				s = s + a.charAt(i)-48;
				dem++;
			}
			
		}
		System.out.print("tong so chan ");
		System.out.println(s);
		System.out.println("co tat ca so chan la :");
		System.out.println(dem);
		
		
	

	}

}
