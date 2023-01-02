package br.com.roberth.treinamento.hackerrank.basico.desafio006;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        double totalPositives = 0.0;
        double totalNegatives = 0.0;
        double totalZeros = 0.0;
        int arraySize = arr.size();
        for (Integer number : arr) {
            if (number > 0) {
                totalPositives++;
            } else if (number < 0) {
                totalNegatives++;
            } else {
                totalZeros++;
            }
        }
        System.out.printf("%.6f\n", totalPositives/arraySize);
        System.out.printf("%.6f\n", totalNegatives/arraySize);
        System.out.printf("%.6f", totalZeros/arraySize);
    }

}

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
    
}
