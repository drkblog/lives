package ar.com.drk.lives.algorithm.string;

import com.google.common.collect.ImmutableList;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListAnagramsTest {

  @Test
  void findAnagramsOf() {
    final ListAnagrams finder = new ListAnagrams(getWords());
    final List<String> anagrams = finder
        .findAnagramsOf("dater");
    assertEquals(
        ImmutableList.of("rated", "trade"),
        anagrams
    );
  }

  List<String> getWords() {
    try {
      final InputStream wordStream = ListAnagrams.class.getResourceAsStream("/small-words-list.txt");
      return IOUtils.readLines(wordStream, StandardCharsets.UTF_8);
    } catch (final IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}