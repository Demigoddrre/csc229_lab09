/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){
            for (; j<=n;  j=j*2){
                 //System.out.print("A'");
                 x++;
            }
        }
         for (;k<=j*j; k++){
            //System.out.print("A'");
            y++;
         }

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
    
    public static void func2(int n){
        int k,j,i=n;
        while(i>1){
            j=1;
            while(j<n){
                k=0;
                while(k<n){
                    k=k+2;
                   
                }
                j=j*2;
            }
            i=i/2;
        }
       
    }
    
   // also discuss T(n) = 3 T(n/4) + n
    //Func1 and Func2 have the same time complexity of O(n log n), both contain two nested
    //loops with the inner loop iterating log n times. The space complexity for both is also O(1) due 
    //to only using a constant amount of memory to store loop counters and temporary variables.
    //Additionally, the recurrence relation T(n) = 3T(n/4)+n has a time complexity of O (nlogn) by Master theorem,
    //while its space complexity is slightly higher at O (log n).
    
}
