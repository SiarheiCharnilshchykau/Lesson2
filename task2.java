import java.util.Scanner;

public class task2 {

	public static void main (String[] args) {
		
		double a=0, b=0, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� a: "); 
				if (sc.hasNextDouble()) {  
			a = sc.nextDouble();  
			} 
		
				 
		System.out.println("������� b: "); 
		if (sc.hasNextDouble()) {  
			b = sc.nextDouble();  
			} 
				 
		
		System.out.println("������� c: "); 
		if (sc.hasNextDouble()) {  
			c = sc.nextDouble();  
			} 
		
		double result, res2;
		res2 = 2*a;
		
		if (res2 != 0) { 
		result = (b + Math.sqrt(b*b+4*a*c))/2*a - a*a*a*c + b;
		System.out.println("����� =" + result);
		}
		else 
		System.out.println("����������� ����� ����");
		}
	}

