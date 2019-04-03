/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalt;

/**
 *
 * @author Vimanalogy
 */
public class Percobaan {

    public Percobaan() {
     int i;
   float  f = 2.3f;
   double d = 2.7;
   i = ((int)Math.ceil(f)) * ((int)Math.round(d));
 
   System.out.println(i);
    }
    public void test(){
        int x = 10, y=0;
	      if(x < 10) 
	         y = 1;
	      if(x>= 10) y = 2;
	      System.out.println("y is " + y);
    }
    
}
