/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalt.SubPackage;

/**
 *
 * @author Vimanalogy
 */
public class Matrix {
   
    public static void main(String [] args){
        Matrix m = new Matrix();
        Matrix ma = new Matrix();
        ma.matrix_solution(3);
        m.matrix_solution(5);
    }
    
    private void matrix_solution(int number)
    {
        if (number <= 0) {
            System.out.print("Angka yang diinput harus lebih besar dari 0");
        }
        
        for(int i=1; i <= number; i++){
            System.out.print(i+"           "); 
                                          
            for(int j=i; j < (i*number); j = (j+i)){
                System.out.print((j+i)+"           ");
            }
            System.out.println("");
        }
    }
}

