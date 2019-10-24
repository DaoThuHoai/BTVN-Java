import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Person a=new Person();
		Person b=new Person();
		// Đối tượng 1
		System.out.print("Ten :");
		a.setName("SonDepTrai");
		System.out.println(a.getName());
		System.out.print("Tuoi :");
		a.setAge(20);
		System.out.println(a.getAge());
		System.out.print("So thich :");
		a.setHobbyString("nghe nhac");
		System.out.println(a.getHobbyString());
		System.out.print("Giới tính :");
		a.setSex("Nam");
		System.out.println(a.getSex());
		
		
		//Đối tượng 2
		
		b.setName("TuDepTrai");
		System.out.println(b.getName());
		System.out.print("Tuoi :");
		b.setAge(20);
		System.out.println(b.getAge());
		System.out.print("So thich :");
		b.setHobbyString("ăn chơi");
		System.out.println(b.getHobbyString());
		System.out.print("Giới tính :");
		a.setSex("Nam");
		System.out.println(a.getSex());
		
		

	}

}
