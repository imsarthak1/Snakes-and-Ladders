import java.util.Random;
import java.util.Scanner;

class GAME{
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int p1 = 1;
        int p2 = 1;

        while((p1<100)||(p2<100)){
            int x = r.nextInt(6)+1;
            int y = r.nextInt(6)+1;
            
            System.out.print("player 1st turn : " );
            System.out.println(sc.nextLine()+ x);
            System.out.print("player 2nd turn : " );
            System.out.println(sc.nextLine()+ y);
            System.out.println();
            
            p1 = p1 + x;
            p2 = p2 + y;

            if(p1==2){
                p1 = 23;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==2) {
                p2 = 23;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==8){
                p1 = 34;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==8) {
                p2 = 34;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==20){
                p1 = 77;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==20) {
                p2 = 77;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==32){
                p1 = 68;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==32) {
                p2 = 68;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==41){
                p1 = 79;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==41) {
                p2 = 79;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==74){
                p1 = 88;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==74) {
                p2 = 88;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==82){
                p1 = 100;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==82) {
                p2 = 100;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==85){
                p1 = 95;
                System.out.println("Player 1 climbed the ladder");
            }else if (p2==85) {
                p2 = 95;
                System.out.println("Player 2 climbed the ladder");
            }

            if(p1==29){
                p1 = 9;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==29) {
                p2 = 9;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==38){
                p1 = 15;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==38) {
                p2 = 15;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==47){
                p1 = 5;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==47) {
                p2 = 5;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==53){
                p1 = 33;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==53) {
                p2 = 33;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==62){
                p1 = 37;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==62) {
                p2 = 37;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==86){
                p1 = 54;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==86) {
                p2 = 54;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==92){
                p1 = 70;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==92) {
                p2 = 70;
                System.out.println("Player 2 is bitten by a snake");
            }

            if(p1==97){
                p1 = 25;
                System.out.println("Player 1 is bitten by a snake");
            }else if (p2==97) {
                p2 = 25;
                System.out.println("Player 2 is bitten by a snake");
            }

            if((p1>=100)){
                p1 = 100;
            }else if((p2>=100)){
                p2 = 100;
            }
            System.out.println();
            System.out.println("Position of 1st Player is : "+ p1);
            System.out.println("Position of 2nd Player is : "+ p2);
            System.out.println();

            if((p1>=100)){
                System.out.println("Player 1 wins...");
                break;
            }else if((p2>=100)){
                System.out.println("Player 2 wins...");
                break;
            }
        }
        
    }
}