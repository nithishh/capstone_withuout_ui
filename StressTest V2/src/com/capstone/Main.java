package com.capstone;

import com.capstone.generate.GenerateArray;
import com.capstone.generate.GenerateChar;
import com.capstone.generate.GenerateInt;
import com.capstone.app.InputFormat;
import com.capstone.generate.GenerateString;
import com.capstone.template.ClassGen;
import com.capstone.template.GenMethods;
import com.capstone.testGen.GenTests;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GenTests genTests = new GenTests();

        //genTests.deleteFiles();
        genTests.createFiles(10);

        //Int - 1
        genTests.writeInt(10,-19);

        //Charcter - 10
        genTests.writeAlpha();
        genTests.writeUpperAlpha();
        genTests.writeLowerAlpha();
        genTests.writeDigitChar();
        genTests.writeSplchar();
        genTests.writeParaChar();
        genTests.writeBracketChar();
        genTests.writeChar();
        genTests.writeVowel();
        genTests.writeConsonant();

        //String - 12
        genTests.writeWord();
        genTests.writeLowerWord();
        genTests.writeLowerSortWord();
        genTests.writeUpperWord();
        genTests.writeUpperSortWord();
        genTests.writePhrase();
        genTests.writeNumWord();
        genTests.writeParaWord();
        genTests.writeBracketWord();
        genTests.writeBinWord();
        genTests.writeConsonantWord();
        genTests.writeVowelWord();

        // Array - 7
       genTests.writeIntArray(10,15);
       genTests.writeSortIntArray(10,15);
       genTests.writeDSortIntArray(10,15);
       genTests.writeStringArray();
       genTests.writeLowerStringArray();
       genTests.writeUpperStringArray();
       genTests.writeMat(10,15,"square");
        genTests.writeMat(10,15,"!square");

    }
}
