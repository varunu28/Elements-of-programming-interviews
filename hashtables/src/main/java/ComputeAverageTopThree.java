import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class ComputeAverageTopThree {

    /*
    13.11
    */

  public static String findStudent(Iterator<NameScore> iterator) {
    int k = 3;
    Map<String, Entry> scoreMap = new HashMap<>();
    while (iterator.hasNext()) {
      NameScore next = iterator.next();
      if (!scoreMap.containsKey(next.name)) {
        scoreMap.put(next.name, new Entry(next.name, k));
      }
      scoreMap.get(next.name).addScore(next.score);
    }
    int maxScore = 0;
    String name = "";
    for (String key : scoreMap.keySet()) {
      if (scoreMap.get(key).pq.size() < k) {
        continue;
      }
      if (maxScore < scoreMap.get(key).totalScore) {
        maxScore = scoreMap.get(key).totalScore;
        name = key;
      }
    }
    return name;
  }

  public static class NameScore {

    public String name;
    public Integer score;

    public NameScore(String name, Integer score) {
      this.name = name;
      this.score = score;
    }
  }
}


class Entry {

  String name;
  int totalScore;
  int k;
  PriorityQueue<Integer> pq;

  public Entry(String name, int k) {
    this.name = name;
    totalScore = 0;
    this.k = k;
    pq = new PriorityQueue<>(Comparator.comparingInt(o -> o));
  }

  public void addScore(int score) {
    pq.add(score);
    totalScore += score;
    if (pq.size() > k) {
      totalScore -= pq.poll();
    }
  }
}