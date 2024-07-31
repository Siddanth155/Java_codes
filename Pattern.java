// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;

public class Pattern {
  public static void main(String[] args) {

    System.out.println("right angle triangle");
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    int i, j;
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 6 - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5; j++) {
        if (j >= i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    System.out.println();
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5; j++) {
        if (j >= 6 - i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Now Equilateral triangle ");
    System.out.println();
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (j = 1; j <= 11 - 2 * i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 6 - i; j++) {
        System.out.print("  ");
      }
      for (j = 1; j <= 2 * i - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Now see square");
    System.out.println();
    for (i = 1; i <= 5; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 || i == 5 || j == 1 || j == 5) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

}