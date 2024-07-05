import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a03();
  }

  void a03() {
    Scanner scanner = new Scanner(System.in); // 객체 생성,

    int width = 0; // 가로크기
    int height = 0; // 세로크기
    int area = 0; // 직사각형의 넓이

    System.out.print("Enter width of Rectangle > ");
    width = scanner.nextInt();

    System.out.print("Enter height of Rectangle > ");
    height = scanner.nextInt();

    area = (width * height);

    System.out.println("Area of Rectangle is " + area);

  }
}
