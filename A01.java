import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a01();
  }

  //나이 = <올해년도> – 태어난 년도 + 1 
  
  void a01(){
    Scanner scanner = new Scanner(System.in);
    int birth_year=0; // 태어난 년도 
    int age=0; // 나이
    
    System.out.print("Enter a birth year > ");
    birth_year = scanner.nextInt(); 
    
    age = 2024 - birth_year + 1;
    System.out.println("You are " + age +" years old.");
  }
}