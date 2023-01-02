package br.com.roberth.treinamento.hackerrank.basico.desafio008;

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

    public static void miniMaxSum(List<Integer> arr) {
        long maxSum = 0;
        long minSum = 0;
        long commonSum = 0;
        arr.sort(Collections.reverseOrder());
        for (int i = 1; i < arr.size()-1; i++) {
            commonSum += arr.get(i);
        }
        maxSum += commonSum + arr.get(0);
        minSum += commonSum + arr.get(arr.size()-1);
        System.out.println(minSum+" "+maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
