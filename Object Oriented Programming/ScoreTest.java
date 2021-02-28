import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Vector v = new Vector();
    int highestScore = 0;
    while (true) {
      System.out.println("Enter student's score: ");
      int score = scanner.nextInt();
      if (score < 0) {
        break;
      }
      if (score > 100) {
        System.out.println("Invalid score!\n");
        continue;
      }
      if (score > highestScore) {
        highestScore = score;
      }
      // Integer inScore = score;
      v.addElement(score);
    }

    char level;
    for (int i = 0; i < v.size(); i += 1) {
      Object obj = v.elementAt(i);
      Integer inScore = (Integer) obj;
      int score = inScore;
      if (highestScore - score <= 10) {
        level = 'A';
      } else if (highestScore - score <= 20) {
        level = 'B';
      } else if (highestScore - score <= 30) {
        level = 'C';
      } else {
        level = 'D';
      }
      System.out.println("Student " + i + " score is " + score + ". Grade: " + level);
    }
  }
}
