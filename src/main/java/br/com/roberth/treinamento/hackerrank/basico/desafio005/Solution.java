package br.com.roberth.treinamento.hackerrank.basico.desafio005;

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

    public static int diagonalDifference(List<List<Integer>> arr) {
        int absoluteDifference = 0;
        int somaDiagonal1 = 0;
        int somaDiagonal2 = 0;
        int totalLinhas = arr.size();
        int totalColunas = arr.get(0).size();
        int c = 0;
        
        for(int l = 0; l < totalLinhas; l++) {            
            somaDiagonal1 += arr.get(l).get(c);
            somaDiagonal2 += arr.get(l).get(totalColunas-c-1);
            c++;
        }
        absoluteDifference = Math.abs(somaDiagonal1 - somaDiagonal2);
        return absoluteDifference;
    }

}

public class Solution {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
