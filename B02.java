import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b02();
  }

  void b02(){
    Scanner scanner = new Scanner(System.in);
    double input_degree = 0; // 입력받은 온도 
    String kind = ""; // 온도의 종류, 섭씨온도이면 'C', 화씨온도이면 'F' 
    double output_degree = 0; // 변환한 온도

    System.out.print("Enter temperature > ");
    input_degree = scanner.nextDouble();

    System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
    kind = scanner.next();

    if(kind.equals("C")){ // 섭씨
      output_degree = (input_degree * 1.8) + 32;
      System.out.println("Fahrenheit temperature is " + output_degree);
    } else if(kind.equals("F")){ // 화씨
      output_degree = (input_degree - 32) / 1.8;
      System.out.println("Celsius temperature is " + output_degree);
    } 
    scanner.close(); // Scanner 객체 닫기
  }
}
