public class recursionDriver
{
 public static void main(String[] args)
 {
     /*
     * Count 
     * 1. Number of legs 10 elephant have
     * 2. Number of students in a school if each
     * class has 20 students and there are 12 rooms
     * 3. Number of fingers if there are 8 people
     * 4. Find the sum of odd numbers from 0 to N
     * 5. Find the sum of even numbers from 0 to N
    */ 
     int counted=0;
     // Task 1.
     counted = count1(10);
     System.out.println(counted);
 }
 
 public static int count1(int a)
 {
     if(a<1)
     {
         return 0;
     }
     return 4+(a-1);
 }
 public static int count2(int a)
 {
     
 }
 public static int count3(int a)
 {
     
 }
 public static int count4(int a)
 {
     
 }
 public static int count5(int a)
 {
     
 }
}