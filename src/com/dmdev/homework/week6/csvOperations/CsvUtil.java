package com.dmdev.homework.week6.csvOperations;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class CsvUtil {

    private CsvUtil() {
    }

    public static Map<String, List<String>> mergeByKey(Map<String, String> names, Map<String, String> prices) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String id :
                names.keySet()) {
            List<String> list = new ArrayList<>();
            list.add(names.get(id));
            list.add(prices.get(id));
            resultMap.put(id, list);
        }
        return resultMap;
    }

    public static Map<String, String> parseNamesToMap(Path namesPath) throws IOException {
        Map<String, String> namesMap = new HashMap<>();
        try (Scanner scanner = new Scanner(namesPath)) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] valuesOfRow = row.split(",");
                try {
                    for (int i = 0; i < valuesOfRow.length; i++) {
                        namesMap.put(valuesOfRow[0], valuesOfRow[1]);
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                    namesMap.put(valuesOfRow[0], null);
                }
            }
            return namesMap;
        }
    }

    public static Map<String, String> parsePricesToMap(Path pricePath) throws IOException {
        Map<String, String> priceMap = new HashMap<>();
        try (Scanner scanner = new Scanner(pricePath)) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] valuesOfRow = row.split(",");
                try {
                    for (int i = 0; i < valuesOfRow.length; i++) {
                        priceMap.put(valuesOfRow[0], valuesOfRow[1]);
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                    priceMap.put(valuesOfRow[0], null);
                }
            }
            return priceMap;
        }
    }

    public static boolean areEqualKeySets(Map<String, String> names, Map<String, String> prices) {
        return names.keySet().equals(prices.keySet());
    }

    public static List<String> getEmptyIdList(Map<String, String> names, Map<String, String> prices) {
        List<String> idList = new ArrayList<>();
        if (areEqualKeySets(names, prices)) {
            for (String id :
                    names.keySet()) {
                if (names.get(id) == null && prices.get(id) == null) {
                    idList.add(id);
                }
            }
        } else throw new RuntimeException("KeySets are not equal: unable to compare");
        return idList;
    }

    public static void writeErrorsToFile(List<String> errorList, Path errorsPath) throws IOException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(errorsPath, StandardOpenOption.CREATE)) {
            for (String li : errorList) {
                bufferedWriter.write(li);
                bufferedWriter.newLine();
            }
        }
    }

    public static void writeMapToFile(Map<String, List<String>> fullInfoMap, Path resultPath) throws IOException {
        File resultFile = new File(String.valueOf(resultPath));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {
            for (Map.Entry<String, List<String>> entry :
                    fullInfoMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + " " + entry.getValue());
                bufferedWriter.newLine();
            }
        }
    }
}