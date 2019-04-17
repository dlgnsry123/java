   

package chap04_ex07;



import java.util.Scanner;



public class BookArray {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*

		 * Book클래스를 활용한다. 2깨짜리 Bok 객체배열을 만든다. 사용자로부터 책의 제목과 저자를 입력 받아 배열에 저정하고

		 * 출력하는 프로그램을 만든다.

		 * 

		 * 입력/출력형식은 아래와 같다.

		 * 

		 * 입력 제목>>간영훈과 아이들 <-- 입력받는곳 저자>>성지석 제목>>주수용과돌아이 저자>>간영훈

		 * 

		 * 출력 (간영훈과 아이들, 성지석) (주수용과돌아이, 간영훈)

		 * 

		 */

		Book[] book = new Book[2]; // 배열 선언



		Scanner scanner = new Scanner(System.in); // 입력받기 위한 준비



		for (int i = 0; i < book.length; i++) { // Quiz : book.length = 2

			System.out.print("제목입력>>");

			String title = scanner.nextLine();

			System.out.print("저자입력");

			String author = scanner.nextLine();

			book[i] = new Book(title, author);

		}



		for (int i = 0; i < book.length; i++)

			System.out.print(book[i].title + book[i].author);



	}



}