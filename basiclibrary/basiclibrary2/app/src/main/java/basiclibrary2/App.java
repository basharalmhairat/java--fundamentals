/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary2;
import java.util.*;
import java.util.stream.Collectors;
public class App {

    public static String weatherTemperature(int[][] Array) {

        HashSet<Integer> UTemperature = new HashSet<Integer>();
        for (int[] arr : Array) {
            for (int value : arr) {
                UTemperature.add(value);
            }
        }
        int Low = Collections.min(UTemperature);
        int High = Collections.max(UTemperature);
        StringBuilder uTemp = new StringBuilder();
        uTemp.append("High: ").append(High).append("\n");
        uTemp.append("Low: ").append(Low).append("\n");

        for (int i = Low; i < High; i++) {
            if (!UTemperature.contains(i)) uTemp.append("Never saw temperature: ").append(i).append("\n");
        }
        return uTemp.toString();
    }
    public static String tally(List<String> votes) {
        Map<String, Long> counts =
                votes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        String key = Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key + " received the most votes!";

    }

//public static void main (String args []){
//    System.out.println(tally(votes));
//    System.out.println(tally(weatherTemperature([][])));
//}


    }
