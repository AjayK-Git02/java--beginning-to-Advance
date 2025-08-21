public class arr{
  public static void main(String[] args) {
    //  int[] myArr = new int[5];
    // myArr[0] = 54;
    // myArr[1] = 23;
    // myArr[2] = 34;
    // myArr[3] = 45;
    // myArr[4] = 56;

    int[] myArr ={54,23,34,45,56};
    // int index = 0;
    // System.out.println(myArr[0]);
    // System.out.println(myArr[1]);
    // System.out.println(myArr[index]);//54 ans hoga
    // System.out.println(myArr[3]);
    // System.out.println(myArr[4]);
    int index = 0;
    while(index<myArr.length){
      System.out.print("\n"+myArr[index]);
      index++;

    }
   
  }
}