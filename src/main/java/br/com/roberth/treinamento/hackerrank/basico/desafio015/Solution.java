package br.com.roberth.treinamento.hackerrank.basico.desafio015;

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
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        Integer maxScore = scores.get(0);
        Integer minScore = scores.get(0);
        for (Integer score : scores) {                     
            if (score > maxScore) {
               result.set(0, result.get(0) + 1);
               maxScore = score;
            } 
            if (score < minScore) {                
                result.set(1, result.get(1) + 1);
                minScore = score;
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
