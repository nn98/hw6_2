package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("hw6_2: 김윤서\n");
		do {
			System.out.println("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:정수삭제 8:양방향 출력 9:종료");
			c=s.nextInt();
			switch(c) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("맨 앞에 삽입할 정수 입력:");
				int i=s.nextInt();
				list.addFirst(i);
				break;
			case 4:
				System.out.println("맨 뒤에 삽입할 정수 입력:");
				int i1=s.nextInt();
				list.addLast(i1);
				break;
			case 5:
				try {
					System.out.println("맨 앞의 정수 :"+list.removeFirst());
				}
				catch (NullPointerException e) {
					System.out.println("맨 앞에 정수가 존재하지 않습니다.");
				}
				break;
			case 6:
				try {
					System.out.println("맨 뒤의 정수 :"+list.removeLast());
				}
				catch (NullPointerException e) {
					System.out.println("맨 뒤에 정수가 존재하지 않습니다.");
				}
				break;
			case 7:
				try {
					System.out.println("삭제할 정수 입력 :");
					int r=s.nextInt();
					System.out.println("입력한 정수 :"+r+"삭제결과 :"+list.remove(r));
				}
				catch (NullPointerException e) {
					System.out.println("입력한 정수가 존재하지 않습니다.");
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