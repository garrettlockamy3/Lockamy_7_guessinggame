                                     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockamy_7_evens;

public class Lockamy_7_evens {
    public static void main(String[] args) {
        
        int counter = 0;
        for(int i = 0; i < 100; i++) {
            //what happens in the loop,
            //will happen again and again
            //until the loop exits
            if(isPrime(i)) {
                counter += 1;
                System.out.println(i + " is Prime!");
            }
        }
        System.out.println("We have "
                        + counter + " total Prime!");
    }
    
    
    /*
    A method is like a little program.
    A mehtod is an action you want to repeat
    frequently.
    */
     static boolean isEven (int somenumber) {
        return (somenumber % 2 ==0);
}
     static boolean isOdd (int somenumber) {
        return (somenumber % 2 !=0);
}
static boolean isPrime (int somenumber) {
    int divisor = 0;
    for (int i = 2; i < somenumber; i++) {
        if(somenumber% i == 0) {
            divisor++;
        }
    }
        

    return (divisor == 0);
}}