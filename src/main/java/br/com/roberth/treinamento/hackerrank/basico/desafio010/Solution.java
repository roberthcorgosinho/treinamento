package br.com.roberth.treinamento.hackerrank.basico.desafio010;

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

    public static String timeConversion(String s) {
        String period = s.substring(s.length()-2, s.length());
        String hour24 = ":" + s.substring(0, s.length()-2).split(":")[1] + ":" + s.substring(0, s.length()-2).split(":")[2];
        Integer hours = Integer.valueOf(s.substring(0, s.length()-2).split(":")[0]);
        if (period.equalsIgnoreCase("pm")) {
            if (hours != 12) {
                hours += 12;
            }
        } else {
            if (hours == 12) {
                hours = 0;
            }
        }
        
        if (hours < 10) {
            hour24 = "0"+hours+hour24;
        } else {
            hour24 = hours+hour24;
        }
        
        return hour24;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
