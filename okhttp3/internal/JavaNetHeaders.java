package okhttp3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.Headers;

public final class JavaNetHeaders {
  private static final Comparator<String> FIELD_NAME_COMPARATOR = new Comparator<String>() {
      public int compare(String param1String1, String param1String2) {
        return (param1String1 == param1String2) ? 0 : ((param1String1 == null) ? -1 : ((param1String2 == null) ? 1 : String.CASE_INSENSITIVE_ORDER.compare(param1String1, param1String2)));
      }
    };
  
  public static Map<String, List<String>> toMultimap(Headers paramHeaders, String paramString) {
    TreeMap<String, Object> treeMap = new TreeMap<String, Object>(FIELD_NAME_COMPARATOR);
    int j = paramHeaders.size();
    for (int i = 0; i < j; i++) {
      String str1 = paramHeaders.name(i);
      String str2 = paramHeaders.value(i);
      ArrayList<String> arrayList = new ArrayList();
      List list = (List)treeMap.get(str1);
      if (list != null)
        arrayList.addAll(list); 
      arrayList.add(str2);
      treeMap.put(str1, Collections.unmodifiableList(arrayList));
    } 
    if (paramString != null)
      treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(paramString))); 
    return (Map)Collections.unmodifiableMap(treeMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/JavaNetHeaders.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */