import java.util.Scanner;

public class task1 { 
	
	public static void main(String[] args) { 
		int n = 10; // ������ ������������� ���������� n ������ 10 
		Scanner sc = new Scanner(System.in); //������������� ���� � �������
		String max = "", min = "", str = ""; // ������ ��������� ���������� � ���������� ������� ����������
		
		for (int i = 0; i < n; i++) { // ���� �� 0 �� n (� ��� 10) 
		    System.out.print("> "); //�������� > 
		    if (sc.hasNextLine()) { // ������� ��� ����������� �����
			str = sc.nextLine(); // ����������� ���������� �������� ��������
			if (i == 0) { 
				min = str; // ������� ��� ������� ������������ min
			}
			if (str.length() > max.length()) { //������� ��� ������� ������������ max 
				max = str;     
			} else if (str.length() < min.length()) {    //��������� min � max
				min = str;   
			}
			}
			
		}
		System.out.println("max string = " + max + " length=" + max.length()); //����� max + ����� ������
		System.out.println("min string = " + min + " length=" + min.length()); // ����� in + ����� ������
		}
	} 
			
		
			

