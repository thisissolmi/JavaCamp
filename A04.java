import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a04();
  }
  void a04(){
    Scanner scanner = new Scanner(System.in); // 객체 생성,

    double m2_area=0; // 면적 (제곱미터)
    double pyung_area=0; // 면적 (평수)
    
    System.out.print("Enter area of Apartment(m^2) > " );
    m2_area = scanner.nextDouble(); // 면적 입력

    pyung_area = m2_area / 3.305; // 평수 계산
    System.out.printf("Area of Apartment(평수) %.1f", pyung_area);
  }
}

/*

아파트의 분양 면적을 제곱미터(m2) 단위로 입력받아 이 값을 평형 단위의 값으로 변환하여 출력하라. 단, 평형 수 = 제곱미터 / 3.305 로 계산한다. 변수는 다음과 같이 사용하라.

double m2_area; // 면적 (제곱미터)

double pyung_area; // 면적 (평수)

소스에서 a04() 함수 내에 코드를 완성하라.

Enter area of Apartment(m^2) > 105.5
Area of Apartment(평수) 31.9
*/
