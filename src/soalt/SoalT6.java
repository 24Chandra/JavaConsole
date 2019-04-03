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
public class SoalT6 {
    void test(){
        int[] arr = {1,2,3,4};
	call_array(arr[0], arr);
        System.out.println("====Soal Test 6====");
	System.out.println(arr[0] + "," + arr[1]);  
    }
    static void call_array(int i, int arr[]) 
    {
	arr[i] = 6;
	i = 5;
   }
    void test2(){
        int x;
		x = -3 >> 1;
		x = x >>> 2;
		x = x << 1;
	 	System.out.println(x);
    }
    protected void test3(){
         String s1 = "abc";
    String s2 = "abc";
    if(s1 == s2)
        System.out.println(1);
    else
        System.out.println(2);
    if(s1.equals(s2))
        System.out.println(3);
    else
        System.out.println(4);
    }
    void test4(){
        String s1 = "abc";
    String s2 = new String("abc");

    if(s1 == s2)
        System.out.println(1);
    else
        System.out.println(2);
    if(s1.equals(s2))
        System.out.println(3);
    else
        System.out.println(4);
    }
    void test5(){
        int i = -1;
	i = i >> 1;	 
	System.out.println(i);
    }
    protected void test6(){
        int x = 0;
			if(x > 0) x = 1;
			switch(x) {
			case 1: System.out.println(1);
			case 0: System.out.println(0);
			case 2: System.out.println(2);
				break;
			case 3: System.out.println(3);
			default: System.out.println(4);
			break;
			}
    }
}
