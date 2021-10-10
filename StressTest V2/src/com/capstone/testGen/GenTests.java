package com.capstone.testGen;

import com.capstone.generate.GenerateArray;
import com.capstone.generate.GenerateChar;
import com.capstone.generate.GenerateInt;
import com.capstone.generate.GenerateString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class GenTests {

    //100(regular) or 1000(deep scan)
    int testCount = 10;

    String space = " ";

    String path = "C:\\Users\\nithi\\OneDrive\\Desktop\\TestCases\\";

    public void createFiles(int n){
        testCount = n;

        for(int i=0;i<testCount;i++) {
            try {
                File file = new File(path + Integer.toString(i)+".txt");
                file.createNewFile();
            }
            catch (IOException exception) {
                System.out.println("unable to create file " +i);
                System.exit(0);
            }
        }
    }

    public void deleteFiles(){
        for(int i=0;i<testCount;i++) {

            File file = new File(path + Integer.toString(i)+".txt");
            if(!file.delete()){
                System.out.println("unable to delete file "+i);
            }
        }
    }

//*************************************************  Integer  **********************************************************
    public void writeInt(int a, int b){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int temp = GenerateInt.getInt(a,b);
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


//************************************************  Charcter  **********************************************************

    // alpha charcter

    public  void writeAlpha(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getAlpha());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Upper alpha character

    public void writeUpperAlpha(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getUpperAlpha());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Lower alpha character

    public void writeLowerAlpha(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getLowerAlpha());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Digit character

    public void writeDigitChar(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getDigitChar());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }



    // Special character

    public void writeSplchar(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getSplChar());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // () char

    public void writeParaChar(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getParaChar());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Bracket charcter

    public void writeBracketChar(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getBracketChar());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // any char

    public void writeChar(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getChar());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Vowel charcter

    public void writeVowel(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getVowel());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Consonant charcter

    public void writeConsonant(){
        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = String.valueOf(GenerateChar.getConsonant());
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }

//************************************************  String  ************************************************************


    // Word string

    public void writeWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Lower string

    public void writeLowerWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getLowerWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Lower sorting string

    public void writeLowerSortWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getLowerSortWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Upper string

    public void writeUpperWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getUpperWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }



    // Upper sort string

    public void writeUpperSortWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getUpperSortWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Phrase string

    public void writePhrase(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getPhrase();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Number string

    public void writeNumWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getNumWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // () string

    public void writeParaWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getParaWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Bracket string

    public void writeBracketWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getBracketWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Binary string

    public void writeBinWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getBinWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Vowel string

    public void writeVowelWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getVowelWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Consonant string

    public void writeConsonantWord(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                String temp = GenerateString.getConsonantWord();
                fwrite.write(temp+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }

//******************************************  Array  *******************************************************************


    // Function to separate the value from string like this [23,6,8,9,]

    public String  toStringSeparator(String str){

        String tempStr ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '[' && str.charAt(i) != ']' && str.charAt(i) != ',' && str.charAt(i) != ' '){
                tempStr += str.charAt(i);
            }
            if(str.charAt(i) == ','){
                tempStr += space;
            }
        }
        return tempStr;
    }


    // Function to write the integer array's test cases in a file

    public void writeIntArray(int a, int b){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                Integer tempArray[] = GenerateArray.getIntArray(a,b, length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Function to write the Sorted(Ascending) integer array's test cases in a file

    public void writeSortIntArray(int a, int b){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                Integer tempArray[] = GenerateArray.getSortIntArray(a,b,length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Function to write the Sorted(Descending) integer array's test cases in a file

    public void writeDSortIntArray(int a, int b){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                Integer tempArray[] = GenerateArray.getDSortIntArray(a,b,length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Function to write the String array's test cases in a file

    public void writeStringArray(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                String tempArray[] = GenerateArray.getStringArray(length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Function to write the Upper Case String array's test cases in a file

    public void writeUpperStringArray(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                String tempArray[] = GenerateArray.getUpperStringArray(length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


    // Function to write the Upper Case String array's test cases in a file

    public void writeLowerStringArray(){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);
                int length = GenerateInt.getInt(1,30);
                fwrite.write(length+"\n");
                String tempArray[] = GenerateArray.getLowerStringArray(length);
                String tempStr = Arrays.toString(tempArray);
                String array = toStringSeparator(tempStr);
                fwrite.write(array+"\n");
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }



    // Function to write 2D array's test cases in a file

    public void writeMat(int a, int b, String MatType){

        for(int i=0;i<testCount;i++) {
            try {
                FileWriter fwrite = new FileWriter(path + Integer.toString(i)+".txt", true);

                int row = GenerateInt.getInt(0,30);
                int column;
                if(MatType == "square"){
                    column = row;
                }
                else{
                    column = GenerateInt.getInt(0,30);
                }
                fwrite.write(row+"\n");
                fwrite.write(column+"\n");
                Integer tempArray[][] = GenerateArray.getMat(a,b,row,column);
                for(int j=0;j<tempArray.length;j++){
                    String tempStr = Arrays.toString(tempArray[j]);
                    String array = toStringSeparator(tempStr);
                    fwrite.write(array+"\n");
                }
                fwrite.close();
            }
            catch (IOException exception) {
                System.out.println("unable to write file "+i);
                System.exit(0);
            }
        }
    }


}
