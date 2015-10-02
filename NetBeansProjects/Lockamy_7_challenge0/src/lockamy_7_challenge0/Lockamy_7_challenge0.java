/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockamy_7_challenge0;

import static lockamy_7_challenge0.Lockamy_7_challenge0.isDiv3;

public class Lockamy_7_challenge0 {
    public static void main(String[] args) {
        
       
        for(int i = 0; i < 500; i++) {
            if(isDiv11(i) & isDiv5(i)){
                System.out.println(i + " Animate this");
            } else if(isDiv11(i) & isDiv3(i)) {
                System.out.println(i + " Herr Direktor");
            } else if(isDiv11(i) & isDiv2(i)) {
                System.out.println(i + " Ninja");
             } else if(isDiv2(i) & isDiv3(i) & isDiv5(i)) {
                System.out.println(i + " Team Building");
             }   else if(isDiv2(i) & isDiv3(i)) {
                System.out.println(i + " Chisme");
             }  else if(isDiv3(i) & isDiv5(i)) {            
                System.out.println(i + " Old School");
             }  else if(isDiv5(i)) {  
                System.out.println(i + " Vidal");
            }   else if(isDiv3(i)) {
                System.out.println(i + " Claughton");
            }   else if(isDiv2(i)) {    
                System.out.println(i + " Davis");
            }   else{
                System.out.println(i + " None");
            }
        
        
    }
    }  static boolean isDiv2 (int somenumber) {
        return (somenumber % 2 ==0);
}
     static boolean isDiv3 (int somenumber) {
        return (somenumber % 3 ==0);
}
     static boolean isDiv5 (int somenumber) {
        return (somenumber % 5 ==0);
     }
      static boolean isDiv11 (int somenumber) {
        return (somenumber % 11 ==0);
     }
      static boolean isDiv55 (int somenumber) {
        return (somenumber % 55 == 0);
      }
      static boolean isDiv33 (int somenumber) {
            return (somenumber % 33 == 0);
        }
      static boolean isDiv22 (int somenumber) {
            return (somenumber % 22 == 0);
      }
     


      
      
      
      
      
 
//public static boolean ('variable''#')

//if(somenumber % 55 == 0){
//sout("animate this")
//}else{

}

      
    