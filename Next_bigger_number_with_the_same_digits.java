import java.util.*;
public class Kata
{
    public static long nextBiggerNumber(long n) {

      List<Long> nList= new ArrayList<>();
      while (n > 0) {
        nList.add(0, n % 10);
        n /= 10;
      }
      
      int i = nList.size() - 1;
      int j = i;
      while (i > 0 && nList.get(i) <= nList.get(i-1)) {
        i--;
      }
      if (i == 0) {
        return -1;
      }
      
      while (nList.get(j) <= nList.get(i-1)) {
        j--;
      }
      Collections.swap(nList, j, i-1);
      List<Long> sub = nList.subList(i, nList.size());
      Collections.sort(sub);
      for (int k = 0; k < sub.size(); k++) {
        nList.set(k + i, sub.get(k));
      }

      for (int l = nList.size()-1, m = 0; l >= 0 && m < nList.size(); l--, m++) {
      n += nList.get(m) * Math.pow(10, l);
      }
      return n;
    }
}
