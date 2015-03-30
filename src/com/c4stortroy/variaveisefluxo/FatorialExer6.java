package com.c4stortroy.variaveisefluxo;

public class FatorialExer6 {

  public static void main(String[] args) {
    long fat =1;
    for(int i = 1; i <=50; i++){
      System.out.println("fat: "+ fat );
      fat = fat * i;
    }
    System.out.println("fatorial: " + fat);
  }
}
