/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalt;
import java.util.Scanner;
/**
 *
 * @author Vimanalogy
 */
public class SwictCaseString {

    public SwictCaseString() {
        String str; 
        
        System.out.println(" masukan Marks");
        Scanner sc = new Scanner(System.in);
        
        str=sc.nextLine();
        
        switch(str) 
        { 
            case "one": 
                System.out.println("one"); 
                break; 
            case "two": 
                System.out.println("two"); 
                break; 
            case "three": 
                System.out.println("three"); 
                break; 
            default: 
                System.out.println("no match"); 
        }
    }
    void loop(){
        int x = 10;
        
        while(x<20){
            System.out.println("   asdas "+ x);
            x++;
            System.out.println("\n");
        }
    }
    void BreakInDoWhile(){
        int i =1;
        do{
            if(i==5){
                break;
            }
        }while(i<=10);
        System.out.println(i);
        i++;
    }
    void ContinueInForLoop(){
        int i;
        for(i=1;i<=10;i++){
            if(i==5)
            {
                i++;
                continue;
            }
            System.out.println(i);
        }
    }
    void fibionance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter of n:     ");
        int n = sc.nextInt();
        fibi(n);
    }

    private void fibi(int n) {
    if(n==0){
        System.out.println("0");
    }else if (n==1){
        System.out.println("0 1");
    }else{
        System.out.println("0 1");
        int a = 0;
        int b = 1;
        for(int i=1;i<n;i++){
            int nextNumber = a+b;
            System.out.println(nextNumber +" ");
            a=b;
            b=nextNumber;
        }
    }    
    }
}
