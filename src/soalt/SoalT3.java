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
public class SoalT3 {
    void test(){
        int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t | ((i++) == 0));
		b = (f | ((i+=2) > 0));
		System.out.println(i + "  Soal Test 3");
    }
    void test2(){
        int hasil;
        hasil = 14 ^ 23;
        System.out.println(hasil+"   soal test 3");
    }
    
    
}
