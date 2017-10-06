package com.company;

/**
 * Created by jh424 on 9/25/17.
 */
public class Encryptor {

    public static String encrypt(char letter, int i){
        String newLetter = null;
        if(i == 1){

            int temp = letter;
            newLetter = Integer.toBinaryString(temp);
        }else if(i == 2){

            int temp = letter;
            newLetter = Integer.toHexString(temp);
        }else if(i == 3){

            int temp = letter;
            newLetter = Integer.toOctalString(temp);
        }else if(i == 4) {

            int temp = letter;
            newLetter = Integer.toString(temp);
        }

       return newLetter;
    }

}
