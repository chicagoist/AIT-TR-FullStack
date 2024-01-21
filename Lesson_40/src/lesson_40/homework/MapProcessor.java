package lesson_40.homework;

import java.util.Map;

public class MapProcessor {

  public Map<String, String> keysFinder(Map<String, String> argsMap) {
    StringBuilder resultKeysA = new StringBuilder();
    StringBuilder resultValuesA = new StringBuilder();
    StringBuilder resultKeysB = new StringBuilder();
    StringBuilder resultValuesB = new StringBuilder();

    for (Map.Entry<String, String> pairs : argsMap.entrySet()) {
      String nextStrKey = pairs.getKey();
      String nextStrValue = pairs.getValue();

      if (nextStrKey.equals("a")) {
        resultKeysA.append(nextStrKey);
        resultValuesA.append(nextStrValue);
      }

      if (nextStrKey.equals("b")) {
        resultKeysB.append(nextStrKey);
        resultValuesB.append(nextStrValue);
      }
    }

    if (resultKeysA.length() > 0 && resultKeysB.length() > 0) {
      String resultKey = resultKeysA.toString() + resultKeysB.toString();
      String resultValue = resultValuesA.toString() + resultValuesB.toString();
      argsMap.put(resultKey, resultValue);
    }

    return argsMap;
  }
}
