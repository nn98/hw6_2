package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("hw6_2: ������\n");
		do {
			System.out.println("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:�������� 8:����� ��� 9:����");
			c=s.nextInt();
			switch(c) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("�� �տ� ������ ���� �Է�:");
				int i=s.nextInt();
				list.addFirst(i);
				break;
			case 4:
				System.out.println("�� �ڿ� ������ ���� �Է�:");
				int i1=s.nextInt();
				list.addLast(i1);
				break;
			case 5:
				try {
					System.out.println("�� ���� ���� :"+list.removeFirst());
				}
				catch (NullPointerException e) {
					System.out.println("�� �տ� ������ �������� �ʽ��ϴ�.");
				}
				break;
			case 6:
				try {
					System.out.println("�� ���� ���� :"+list.removeLast());
				}
				catch (NullPointerException e) {
					System.out.println("�� �ڿ� ������ �������� �ʽ��ϴ�.");
				}
				break;
			case 7:
				try {
					System.out.println("������ ���� �Է� :");
					int r=s.nextInt();
					System.out.println("�Է��� ���� :"+r+"������� :"+list.remove(r));
				}
				catch (NullPointerException e) {
					System.out.println("�Է��� ������ �������� �ʽ��ϴ�.");
				}
				break;
			case 8:
				list.printList();
				break;
			default:
			}
		}while(c!=9);

	}
}