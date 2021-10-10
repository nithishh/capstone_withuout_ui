package com.capstone.generate;

import java.util.Arrays;
import java.util.Random;

public class GenerateString {
    static Random random = new Random();

    static int stringLength;

    // generates a mixed upper lower string
    public static String getWord(){
        String string = "";
        stringLength = random.nextInt(29)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getAlpha();
        }
        return string;
    }

    // generates a string with lower case
    public static String getLowerWord(){
        String string = "";
        stringLength = random.nextInt(29)+1;
        for(int i=0;i<stringLength;i++) {
            string += GenerateChar.getLowerAlpha();
        }
        return string;
    }

    // generates a sorted string with lower case
    public static String getLowerSortWord(){
        String string = "";
        stringLength = random.nextInt(29)+1;
        for(int i=0;i<stringLength;i++) {
            string += GenerateChar.getLowerAlpha();
        }
        char[] chars=string.toCharArray();
        Arrays.sort(chars);
        string=new String(chars);
        return string;
    }

    // generates a string with upper case
    public static String getUpperWord(){
        String string = "";
        stringLength = random.nextInt(29)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getUpperAlpha();
        }
        return string;
    }

    // generate a sorted string with uppercase
    public static String getUpperSortWord(){
        String string = "";
        stringLength = random.nextInt(29)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getUpperAlpha();
        }
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        string = new String(chars);
        return string;
    }

    // generates a phrase of string
    public static String getPhrase(){
        String string = "";
        int phraseLength = random.nextInt(10)+1;
        for(int i=0;i<phraseLength;i++){
            string += GenerateString.getWord();
            string += " ";
        }
        return string;
    }

    // generates a number string
    public static String getNumWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for (int i=0;i<stringLength;i++){
            string += GenerateChar.getDigitChar();
        }
        return string;
    }

    // generate a parenthesis string
    public static String getParaWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for (int i=0;i<stringLength;i++){
            string += GenerateChar.getParaChar();
        }
        return string;
    }

    // generate a bracket string
    public static String getBracketWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getBracketChar();
        }
        return string;
    }

    // generates a Binary String
    public static String getBinWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for (int i=0;i<stringLength;i++){
            boolean b = random.nextBoolean();
            if(b){
                string += "1";
            }
            else {
                string += "0";
            }
        }
        return string;
    }

    //generate a vowel string
    public static String getVowelWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getVowel();
        }
        return string;
    }

    //generate a consonant string
    public static String getConsonantWord(){
        String string = "";
        stringLength = random.nextInt(10)+1;
        for(int i=0;i<stringLength;i++){
            string += GenerateChar.getConsonant();
        }
        return string;
    }


}