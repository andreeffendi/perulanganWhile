import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("a=17,b=8 outputnya adalah:");
            System.out.print("aaabbaaabbaaabbaaabaaabaa\n");
            System.out.print("aaabaaabaaabbaaabbaaabbaa\n");
            System.out.print("aabaaabaaabbaaabbaaabbaaa\n");
            System.out.print("bbaaabbaaabaaabaaabaaabaa\n");
            System.out.print("baaabaaabaaabaaabbaaabbaa\n");
        
            jawab = scan.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    }
}