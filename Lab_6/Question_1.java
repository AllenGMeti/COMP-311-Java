/*
*Allen G Meti
*24019726
*Lab 6 Question 1
*/

public class Question_1 {
    //Creating Even(int n) method
    public static void Even(int n){
            if(n%2==0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    public static void main(String[]args){

       // Calling the Even method
       Even(10); 
       Even(15);
    }
 }