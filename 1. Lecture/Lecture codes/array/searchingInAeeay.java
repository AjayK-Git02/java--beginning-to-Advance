import java.util.Scanner;

public class searchingInAeeay {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] arr = {6,8,9,45,67,89,8,9,6,7,};
    System.out.println("WELCOME TO ARRAY SRARCHIG\n");
    System.out.print("PLEASE ENTER THE NUMBER : ");
    int num = input.nextInt();
    boolean isfound = isFound(arr, num);
    if(isfound){
      System.out.println("your number found!!!");
    }else{
      System.out.println("your number is not found !!!!");
    }
  }
  public static boolean isFound(int[] arr, int num){
    int index =0;
    while(index<arr.length){
      if (arr[index]==num){
        return true;}
        index++;
      }

    
    return false;
  }
}
