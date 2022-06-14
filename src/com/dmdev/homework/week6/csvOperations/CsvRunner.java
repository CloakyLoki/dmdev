package com.dmdev.homework.week6.csvOperations;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import static com.dmdev.homework.week6.csvOperations.CsvUtil.*;

/**
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 * <p>
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */
public class CsvRunner {

    public static void main(String[] args) throws IOException {
        Path namesPath = Path.of("src", "com", "dmdev", "homework", "week6", "csvOperations", "csv", "items-name.csv");
        Path pricePath = Path.of("src", "com", "dmdev", "homework", "week6", "csvOperations", "csv", "items-price.csv");
        Path resultPath = Path.of("src", "com", "dmdev", "homework", "week6", "csvOperations", "csv", "result.csv");
        Path errorsPath = Path.of("src", "com", "dmdev", "homework", "week6", "csvOperations", "csv", "errors.csv");

        Map<String, String> namesMap = parseNamesToMap(namesPath);
        Map<String, String> pricesMap = parsePricesToMap(pricePath);
        Map<String, List<String>> completeMap = mergeByKey(namesMap, pricesMap);
        writeMapToFile(completeMap, resultPath);
        writeErrorsToFile(getEmptyIdList(namesMap, pricesMap), errorsPath);

        System.out.println(mergeByKey(namesMap, pricesMap));
        System.out.println(getEmptyIdList(namesMap, pricesMap));
    }
}