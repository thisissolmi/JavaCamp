import java.util.Scanner;

class Main {
  Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b06();
  }

  void b06() {
    Scanner scanner = new Scanner(System.in);

    int kor = 0;
    int eng = 0;
    int math = 0; // 국어점수, 영어점수, 수학점수

    System.out.print("Enter points of Korean > ");
    kor = scanner.nextInt();
    System.out.print("Enter points of English > ");
    eng = scanner.nextInt();
    System.out.print("Enter points of Math > ");
    math = scanner.nextInt();

    int total = 0; // 총점
    total = kor + eng + math;
    
    System.out.println("Total point is " + total);

    double average = 0; // 평균점수
    average = total / 3.0;
    System.out.printf("The average is %.1f\n", average);

    if (kor >= 90) {
      System.out.println("Korean grade is outstanding!");
    }
    if (eng >= 90) {
      System.out.println("English grade is outstanding!");
    }
    if (math >= 90) {
      System.out.print("Math grade is outstanding!");
    }

  }
}