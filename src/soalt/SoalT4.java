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
public class SoalT4 {
    public void methodA(int i)
   {
      System.out.println(i); 
	
   }
   //public int methodA(int i) 
   //{
      //System.out.println(i+1); 
     // return i+1; 
   //}
   void test(){
       byte x = 3;
			x = (byte)~x;
			System.out.println(x+"  soal test 4");
   }
   void test2(){
       int x,y;
		x = 3 & 5;
			y = 3 | 5;
			System.out.println(x + " " + y + "  soal test 4");
   }
   protected void test3(){
        int i , j;
	i = j = 3;
        int n = 2 * ++i;
        int m = 2 * j++;
        System.out.println(i + " " + j + " " + n + " " + m);
   }
}
