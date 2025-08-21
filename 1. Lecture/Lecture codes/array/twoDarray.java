public class twoDarray {
  public static void main(String[] args){
    // int [][] myArr = new int[4][5];
    // myArr[0][0] = 34;
    int[][] rr = {{1,2,3} , {4,5,6} , {7,8,9}};
    // System.out.println(rr[1].length);
    // System.out.println(myArr[0][0]);
    int i =0;
    while (i<rr.length) {// FOT ROWS
      int j=0;
      while(j<rr[i].length){// FOR COLOUMS
        System.out.print(rr[i][j] + " ");
        j++;
      }
      System.out.println();
      i++;
      
    }
  }

  
}
