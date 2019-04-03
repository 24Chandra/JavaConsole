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
public class SoalT5 {
    void test(){
        int x = 10, y;
	      if(x < 10) 
	         y = 1;
	      if(x>= 10) y = 2;
	      //System.out.println("y is " + y);
    }
    void test2(){
         int i=0, j=2;
      do {
         i=++i;
         j--;
      } while(j>0);
        System.out.println("====Soal Test 5====");
      System.out.println(i);
    }
    void test3(){
         SoalT pnt = new SoalT();
	      System.out.println("pnt is " + pnt.name + 
	         " " + pnt.x + " " + pnt.y);	
    }
    void test4(){
        char ch;
        String test2 = "abcd";
	String test = new String("abcd");
        if(test.equals(test2)) {
            if(test == test2)
                ch = test.charAt(0);
	            else
	                ch = test.charAt(1);	           
	        }
	        else {
            if(test == test2)
                ch = test.charAt(2);
            else                
                ch = test.charAt(3);
        }
	        System.out.println(ch);
    }
    protected void test5(){
        boolean x = true;
		int a;
			if(x) a = x ? 1: 2;
			else a = x ? 3: 4;
			System.out.println(a);
    }
    protected void test6(){
        int i,j=0;
	     for(i=10;i<0;i--) { j++; }
	     switch(j) {
     case (0) :
	         j=j+1;
	     case(1):
         j=j+2;
         break;
	     case (2) :
	         j=j+3;
         break;
 	     case (10) :
	         j=j+10;
	         break;
	     default :
	         break;
	     }
   System.out.println(j);
	   
    }
    protected void test7(){
        boolean x = false;
			int a;
		if(x) a = x ? 1: 2;
			else a = x ? 3: 4;
			System.out.println(a);
    }
    protected void test8(){
         SoalT5 test1 = new SoalT5();
            System.out.println(test1.xyz(100));    
    }
     public int xyz(int num) {
        if(num == 1) return 1;
        else return(xyz(num-1) + num);
    }
    void test9(){
        int x, y;
	
			x = 5 >> 2;
			y = x >>> 2;
	 		System.out.println(y);
    }
    void test10(){
         int i=1, j=1;
        try {
            i++; 
            j--;
            if(i == j)
                i++;
        }
        catch(ArithmeticException e) {
            System.out.println(0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(1+"1");
        }
        catch(Exception e) {
            System.out.println(2);
        }
        finally {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
