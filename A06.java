import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a06();
  }
  void a06(){
    Scanner scanner = new Scanner(System.in);
    int kor=0; // 국어점수
    int eng=0; // 영어점수
    int math=0; // 수학점수
    int total=0; // 총점
    double average=0; // 평균점수
    
    System.out.print("Enter points of Korean > ");
    kor = scanner.nextInt();

    System.out.print("Enter points of English > ");
    eng = scanner.nextInt();

    System.out.print("Enter points of Math > ");
    math = scanner.nextInt();

    total = kor + eng + math;
    average = total / 3.0;
    
    System.out.println("Total point is "+ total);
     System.out.printf("The average  is %.1f", average);
    
      


    
    }  
}