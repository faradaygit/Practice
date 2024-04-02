package com.ufa;

public class Test {


//    public static void getNum (){
//        for (int i =1; i<235; i++){{
//            if ((i%3 ==0)||(i%5==0))
//                continue;}
//             System.out.println(i);
//        }
//    }

//    public static int sumArray (int [] a){
//        int b=0;
//        for(int i =0; i < a.length; i++)
//        {
//            if(!(a[i]%2==0)){
//                continue ;
//        }
//            b+=a[i];
//        }
//        return b;
//    }

    public static char [] getArr(String a){
        char [] b = a.toCharArray();
       
        return b;

    }


    public static void main(String[] args) {

//      getNum();

//        int  [] Array = {1,2,3,5,6,7,8,9,0} ;
//        System.out.println(sumArray(Array));
        String s = "privet";
        System.out.println(getArr(s));

    }
}
