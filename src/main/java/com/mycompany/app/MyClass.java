package com.mycompany.app;

import java.util.Arrays;

public class MyClass <E> {

public int []a = new  int[5];

    public MyClass(MyClass mock) {

    }
    public MyClass(){

    }

    public static int[] mysort (int...a){

  for(int i = 0;i<a.length-1;i++){
      for(int j =a.length-2;j>=i;j--){
          if(a[j]>a[j+1]){
              int c = a[j];
              a[j] = a[j+1];
              a[j+1] = c;
          }
      }
  }
return a;
   }

    @Override
    public String toString() {

        return Arrays.toString(a);
    }

    public static void main(String[] args ) {
        int a[] = new int[]{1,8,5,2};
        MyClass.mysort(a);
        System.out.println(Arrays.toString(a));
       }

    }



