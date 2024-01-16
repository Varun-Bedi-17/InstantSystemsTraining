package javaPatterns;

public class Patterns {
    public static void main(String[] args) {
        printStar();
    }
    private static void printStar(){
        int num = 4;

        for (int i = 1; i <= num; i++){
            System.out.println("*".repeat(i));
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= num; j++){
                if( j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= num; j++){
                if( j > num - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= num; j++){
                if( j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
