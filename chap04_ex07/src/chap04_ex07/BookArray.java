   

package chap04_ex07;



import java.util.Scanner;



public class BookArray {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*

		 * BookŬ������ Ȱ���Ѵ�. 2��¥�� Bok ��ü�迭�� �����. ����ڷκ��� å�� ����� ���ڸ� �Է� �޾� �迭�� �����ϰ�

		 * ����ϴ� ���α׷��� �����.

		 * 

		 * �Է�/��������� �Ʒ��� ����.

		 * 

		 * �Է� ����>>�����ư� ���̵� <-- �Է¹޴°� ����>>������ ����>>�ּ���������� ����>>������

		 * 

		 * ��� (�����ư� ���̵�, ������) (�ּ����������, ������)

		 * 

		 */

		Book[] book = new Book[2]; // �迭 ����



		Scanner scanner = new Scanner(System.in); // �Է¹ޱ� ���� �غ�



		for (int i = 0; i < book.length; i++) { // Quiz : book.length = 2

			System.out.print("�����Է�>>");

			String title = scanner.nextLine();

			System.out.print("�����Է�");

			String author = scanner.nextLine();

			book[i] = new Book(title, author);

		}



		for (int i = 0; i < book.length; i++)

			System.out.print(book[i].title + book[i].author);



	}



}