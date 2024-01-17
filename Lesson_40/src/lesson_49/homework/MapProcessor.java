package lesson_49.homework;

import java.util.Map;

public class MapProcessor {

  public Map<String, String> keysFinder(Map<String, String> argsMap) {

    StringBuilder resultKeysA = new StringBuilder();
    StringBuilder resultValuesA = new StringBuilder();
    StringBuilder resultKeysB = new StringBuilder();
    StringBuilder resultValuesB = new StringBuilder();

    // Iterator<Map.Entry<String, String>> iteratorArgsMap =
    //         argsMap.entrySet().iterator();
    for (Map.Entry<String, String> pairs : argsMap.entrySet()) {
      String nextStrKey = pairs.getKey();
      String nextStrValue = pairs.getValue();

      // TEST
      //  for(Map.Entry<String,String> item  : argsMap.entrySet()) {

      // System.out.println("for item = " + item);
      // System.out.println("for nextStrKey = " + nextStrKey);
      // System.out.println("for nextStrValue = " + nextStrValue);
      //  }

      if (nextStrKey.equals("a")) {
        resultKeysA.append(nextStrKey);
        // System.out.println("1.resultKeysA = " + resultKeysA);
        resultValuesA.append(nextStrValue);
        // System.out.println("1.resultValuesA = " + resultValuesA);
      }

      if (nextStrKey.equals("b")) {
        resultKeysB.append(nextStrKey);
        // System.out.println("2.resultKeysB = " + resultKeysB);
        resultValuesB.append(nextStrValue);
        // System.out.println("2.resultValuesB = " + resultValuesB);

        String resultKey = String.valueOf(resultKeysA.append(resultKeysB));
        String resultValue = String.valueOf(resultValuesA.append(resultValuesB));
        // System.out.println("resultKey = " + resultKey);
        // System.out.println("resultValue = " + resultValue);
        argsMap.put(resultKey, resultValue);
        return argsMap;
      }
    }
    return argsMap;
  }
}
