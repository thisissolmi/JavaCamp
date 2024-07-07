import java.util.Scanner;

class Main {
  Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    Main stepB = new Main();
    stepB.b05();
  }
  void b05(){
    Scanner scanner = new Scanner(System.in);
    int days=0; // 날 수 
    int seconds=0; // 초 단위 시간 
    int m_count=0; // 100만 초 포함 횟수

    System.out.print("Enter number of days > ");
    days = scanner.nextInt();

    seconds = days*24*60*60;

    System.out.println("Total seconds is " + seconds);

    
    
    if(seconds > 1000000){
      m_count = seconds / 1000000;
      
      System.out.printf("It includes million seconds %d times", m_count);
    }
    

    
  }
}