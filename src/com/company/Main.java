package com.company;

public class Main {

    public static void main(String[] args) {
	    int [] array = {2,4,5,1,2,3, 8};
	    int [] array2= {2,4,5,1,3,2,3};

	    System.out.println(CheckSeries1_2_3_OfArray(array));
	    System.out.println(CheckSeries1_2_3_OfArray(array2));

    }


    static boolean CheckSeries1_2_3_OfArray (int [] array){
        for (int i = 0; i < array.length -2; i++){
            if(array[i] == 1 && array[i+1] ==2&& array[i+2]==3){
                return true;
            }
        }
        return false;
    }
}
