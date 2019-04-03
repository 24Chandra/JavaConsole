/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherpackage;

/**
 *
 * @author Vimanalogy
 */
public class SoalT7 {
    private int A = 10;
    public int B = 20;
    protected int C = 30;
    int D = 40;
    
    
    public void test(){
        int x = 0, y = 1, z;
		if(x>0){
		z = 0;}
                else{
		z = 1;}
                if(y<0){ 
		 z = 2;}
                else{
		z = 3;
                }
                System.out.println("SoalTes &");
		System.out.println(z); 		
    }
    public void test1(){
                int i, j;
	      int k = 0;
	      j = 2;
	      k = j = i = 1;
	      System.out.println(k+"k");
    }
    public void test2(){
        int i[] = {0,1};
		try 
		{
			 i[2] = i[0] + i[1];
		}
	       catch(ArrayIndexOutOfBoundsException e1)
	       {
			System.out.println("1");
	       }
	      catch(Exception e2) 
	      {
			System.out.println("2");
	      }
	     finally 
	    {
		System.out.println(3);
	    }
	    System.out.println("4");  
    }
}
