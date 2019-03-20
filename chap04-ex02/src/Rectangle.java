import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle(){
		
	}
	
	public int getArea(){
		return width * height;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("값을 입력하세요,>>");
        rect.height = scanner.nextInt();
        rect.width= scanner.nextInt();
        System.out.println("사각형의 면적들" + rect.getArea());
        scanner.close();
		
	}

}
