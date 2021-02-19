import java.util.Scanner;

public class LetterPattern {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Word:");
        String input = s.nextLine();
        int middle = input.length()/2;
        String half = input.substring(middle).concat(input.substring(0,middle));
        String[] letters = half.split("");

        for (int i=0; i< letters.length;i++){
            for (int j=2*(letters.length-i);j>0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(letters[j]+" ");
            }
            System.out.println();
        }
    }


}
