import java.util.Scanner;

public class Main {
    // made by an idiot
    static int[] MemoryArray = new int[] {0,0,0,0, 0,0,0,0};
    static int PI = 0; // Pointers Index
    
    public static void SRToutput() {
      System.out.print("  ");
      for (int i=0; i<MemoryArray.length; i++) {
        System.out.print("["+MemoryArray[i]+"]");
      }
      System.out.print("\n"+("   ").repeat((PI)+1)+"^");
    }
      
    public static void main(String[] args) {
      SRToutput();
      
    	Scanner input = new Scanner(System.in);
      System.out.print("\n   Input: ");
    	input.next();
  }
}