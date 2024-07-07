import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b01();
  }

  void b01(){
    Scanner scanner = new Scanner(System.in);

    int birth_year = 0; // 태어난 년도 
    int age = 0; // 나이

    System.out.print("Enter a birth year > ");
    birth_year = scanner.nextInt();

    age = 2024 - birth_year + 1;

    if (age >= 20) {
      System.out.print("You are adult ");
    } else {
      System.out.print("You are not adult ");
    }

    scanner.close(); // Scanner 객체 닫기
  }
}
