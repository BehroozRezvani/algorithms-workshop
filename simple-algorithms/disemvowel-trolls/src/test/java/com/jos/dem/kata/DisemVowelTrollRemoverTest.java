package com.jos.dem.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DisemVowelTrollRemoverTest {

  private DisemVowelTrollRemover remover = new DisemVowelTrollRemover();

  @Test
  @DisplayName("Removing vowels")
  void shouldRemoveVowels() {
    assertEquals("Ths wbst s fr lsrs LL!", remover.remove("This website is for losers LOL!"));
    assertEquals(
        "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
        remover.remove("No offense but,\nYour writing is among the worst I've ever read"));
    assertEquals("Wht r y,  cmmnst?", remover.remove("What are you, a communist?"));
  }
}
