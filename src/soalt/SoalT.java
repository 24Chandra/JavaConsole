/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalt;
import otherpackage.SoalT7;
import soalt.SubPackage.*;
import java.util.Scanner;
/**
 *
 * @author Vimanalogy
 */
public class SoalT {

    private static void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            int x;
	   int y;
	   String name;
    /**
     * @param args the command line arguments
     */
   
 public static void main(String args[]) { 
  
    for(int i = 1; i < 3; i++)
    for(int j = 3; j >= 1; j--)
      
      System.out.println(j +" "+ i  +"  Soal Test 2");

      SoalT2 s2 = new SoalT2();
      SoalT3 s3 = new SoalT3();
      SoalT4 s4 = new SoalT4();
      SoalT5 s5 = new SoalT5();
      SoalT6 s6 = new SoalT6();
      SoalT7 s7 = new SoalT7();
      
      s2.test();
      s2.test2();
      
      s3.test();
      s3.test2();
      
      //s4.methodA(5); copile error
      s4.test();
      s4.test2();
      s4.test3();
      
      //s5.test(); compile error y variable initialisasi
      s5.test2();
      s5.test3();
      s5.test4();
      s5.test5();
      s5.test6();
      s5.test7();
      s5.test8();
      s5.test9();
      s5.test10();
      
      s6.test();
      s6.test2();
      s6.test3();
      s6.test4();
      s6.test5();
      s6.test6();
      
      s7.test();
      s7.test1();
      s7.test2();
      
      
      new SoalT.testModifier();
      new SoalT.Test();
      new SoalT.IncreDecre();
      new SoalT.IfElse();
      new SoalT.Assert();
      
      new Percobaan();
      new Percobaan().test();
      
      new IfElseIf();
      new SwictCaseString();
      new SwictCaseString().loop();
      new SwictCaseString().BreakInDoWhile();
      new SwictCaseString().fibionance();
      new Matrix().main(args);
      }
      
      

    private static class testModifier {

        public testModifier() {
            SoalT7 st7 = new SoalT7();
            TestModife tm = new TestModife();
        //System.out.println(st7.A); private cannot access
        System.out.println(st7.B); // public can access
        //System.out.println(st7.C); protected cannot access
        //System.out.println(st7.D); default cannot access
        
        //System.out.println(tm.A); //private cannot access
        System.out.println(tm.B); // public can access
        //System.out.println(tm.C); //protected cannot access
        //System.out.println(tm.D); //efault cannot access
        }
    }

    private static class Test {

        public Test() {
            double d = 34.9;
        int i = Math.round((int)d);
        
        int in=24;
        double doo=in;
        System.out.println(i);
        System.out.println(doo);
        
        }
    }
    private static class IncreDecre{
        public IncreDecre(){
        
            int x = 5;
            
            int y = 11;
            
            y=~y;
            
            System.out.println(y + "Hasil");
            
            
            System.out.println(x++);
            System.out.println(++x);
            System.out.println(x--);
            System.out.println(--x);
            
    }
    }
    private static class IfElse{
        public IfElse(){
            int number=12;
            if(number%2==2){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
}

    private static class Assert {

        public Assert() {
            for(int i = 1; i < 3; i++)
            for(int j = 3; j >= 1; j--)
            assert i!=j : i;
        }
    }
}
