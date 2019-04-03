
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
public class IfElseIf {

    public IfElseIf() {
        int marks;
        
        System.out.println(" masukan Marks");
        Scanner sc = new Scanner(System.in);

        marks=sc.nextInt();
        
        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println(" Grade D");
        }
        else if(marks>=60 && marks<70){
            System.out.println(" Grade C");
        }
        else if(marks>=70 && marks<80){
            System.out.println(" Grade B");
        }
        else if(marks>=80 && marks<=100){
            System.out.println(" Grade A");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
