package org.example;

public class Main {
    public static void main(String[] args) {
        int rows = 6;
        for(int i=1; i<=rows; i++){
          for(int j=rows; j>=i; j--){
              if(j==i || j==rows) System.out.print(" *");
              else System.out.print("  ");
          }
            System.out.println();
        }
        for(int i=1; i<=rows; i++){
            if(i==1) continue;
            for(int k=1; k<=i; k++){
                if(k==i || k==1) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
