package ar.com.drk.lives.algorithm.string;

import com.google.common.collect.ImmutableList;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class ListAnagrams {
  private final Map<String, List<String>> anagrams;

  // monas -> amnos
  // manos -> amnos
  // key: amnos -> value: [manos, monas]

  public ListAnagrams(final List<String> dictionary) {
    this.anagrams = new HashMap<>();
    for (final String word : dictionary) {
      anagrams.computeIfAbsent(
          hash(word),
          s -> new ArrayList<>()
      ).add(word);
    }
  }

  public List<String> findAnagramsOf(
      final String word
  ) {
    return ImmutableList.copyOf(
        anagrams.get(hash(word))
    );
  }

  private String hash(final String word) {
    final byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
    Arrays.sort(bytes);
    return new String(bytes);
  }


  private int[] charCount(final String word) {
    final int[] charCounter = new int['z' - 'a' + 1];
    for (int i = 0; i < word.length(); i++) {
      final int index = word.charAt(i) - 'a';
      charCounter[index]++;
    }
    return charCounter;
  }
}
