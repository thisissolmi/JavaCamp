import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b03();
  }

  void b03() {
    Scanner scanner = new Scanner(System.in);

    int width = 0;
    int height = 0; // 가로크기, 세로크기

    int area = 0; // 사각형의 넓이

    System.out.print("Enter width of Rectangle > ");
    width = scanner.nextInt();

    System.out.print("Enter height of Rectangle > ");
    height = scanner.nextInt();

    area = width * height;

    System.out.printf("Area of Rectangle is %d and \n", area);

    if (width == height) {
      System.out.print("it is square");
    } else {
      System.out.print("it is not square");
    }

  }
}