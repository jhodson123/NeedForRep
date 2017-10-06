package com.company;

public class Main {

    public static void main(String[] args) {

        //char[] word = {'S','c','h','o','o','l'};
        String word = "School";
        char letter = 's';
        boolean var = false;
        int j=1;

        Encryptor eObject = new Encryptor();

        double percent = Math.random();
        double d = percent * word.length();
        int startingPos = (int)d;
        System.out.println(startingPos);

        for (int i = 0; i < word.length(); i++){

            if(j>4){
                j=1;
            }

            if (1+i+startingPos > word.length() || var){
                if(!var) {
                    startingPos = 0;
                }
                letter = word.charAt(startingPos);
                startingPos++;
                var = true;
            }else {
                letter = word.charAt(startingPos + i);
            }
            System.out.print(letter);
            String newLetter = eObject.encrypt(letter, j);
            System.out.println(" " + newLetter);

            j++;
        }
    }
}
