import java.util.Scanner;

public class CarpmaTest {

	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say1,say2;
        System.out.println("1. Say�y� Giriniz: ");
        say1 = input.nextInt();
        System.out.println("2. Say�y� Giriniz: ");
        say2 = input.nextInt();
        int sonuc=say1*say2;
        System.out.println(say1 + "*" + say2 + "=" + sonuc);
        
        
    }
}