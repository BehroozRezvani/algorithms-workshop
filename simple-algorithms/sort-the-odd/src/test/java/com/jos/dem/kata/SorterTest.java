package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SorterTest {

  private Sorter sorter = new Sorter();

  @Test
  @DisplayName("Sort some arrays")
  void shouldSortSomeArrays() {
    assertArrayEquals(new int[] {1, 3, 2, 8, 5, 4}, sorter.sort(new int[] {5, 3, 2, 8, 1, 4}));
    assertArrayEquals(new int[] {1, 3, 5, 8, 0}, sorter.sort(new int[] {5, 3, 1, 8, 0}));
  }

  @Test
  @DisplayName("Sort an empty array")
  void shouldSortAnEmptyArray() {
    assertArrayEquals(new int[] {}, sorter.sort(new int[] {}), "should sort an empty array");
  }
}
