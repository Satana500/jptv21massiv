/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JPTV21game1 {
    public static void main(String[] args){
        Random random = new Random();
        int myNumber=random.nextInt(6);
        System.out.println("Zagadano chislo ot 0 do 5");
        System.out.println("U tebja 3 popitki");
        System.out.println("ugadai: ");
        Scanner scanner = new Scanner(System.in);
        int chancenum = 3;
        int cash = 50;
        do{
            int yourNumber = scanner.nextInt();
            if(yourNumber==myNumber){
               System.out.println("URA!! Ugadal!");
               break;}
            if(chancenum == 0){
                System.out.println("U tebja konchilis' chansi");
                cash-=5;
                System.out.printf("Deneg otalos " +cash);
                break;
            }
            if(cash == 0){
                System.out.println("U tebja konchilis dengi");
                System.out.printf("Deneg otalos " +cash);
                break;}
            if(yourNumber!=myNumber){
               System.out.println("ne ugadal!");
               chancenum-=1;
               System.out.printf("chansov otalos " +chancenum);
               cash-=5;
               System.out.printf("Deneg otalos " +cash);
            }
        }while(true);    
    }
}