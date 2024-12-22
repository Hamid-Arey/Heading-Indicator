import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String direction = in.nextLine();
    
    if (direction.length() == 3) {
      char dir1 = direction.charAt(0);
      char bIn1 = direction.charAt(1);
      int bIn = Character.getNumericValue(bIn1);
      char dir2 = direction.charAt(2);

      if (dir1 == 'N' && bIn == 45 && dir2 == 'E') {
        System.out.println("Compass N45E is a bearing of 45");
      } else if (dir1 == 'E' && bIn == 45 && dir2 == 'N') {
        System.out.println("Compass E45N is a bearing of 45");
      } else if (dir1 == 'S' && bIn == 45 && dir2 == 'E') {
        System.out.println("Compass S45E is a bearing of 135");
      } else if (dir1 == 'E' && bIn == 45 && dir2 == 'S') {
        System.out.println("Compass E45S is a bearing of 135");
      } else if (dir1 == 'S' && bIn == 45 && dir2 == 'W') {
        System.out.println("Compass S45W is a bearing of 225");
      } else if (dir1 == 'W' && bIn == 45 && dir2 == 'S') {
        System.out.println("Compass W45S is a bearing of 225");
      } else if (dir1 == 'N' && bIn == 45 && dir2 == 'W') {
        System.out.println("Compass N45W is a bearing of 315");
      } else if (dir1 == 'W' && bIn == 45 && dir2 == 'N') {
        System.out.println("Compass W45N is a bearing of 315");
      } else if (dir1 == 'N' && dir2 == 'E') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 0;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'E' && dir2 == 'N') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 90;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'E' && dir2 == 'S') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 90;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'S' && dir2 == 'E') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 180;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'S' && dir2 == 'W') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 180;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'W' && dir2 == 'S') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 270;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'W' && dir2 == 'N') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 270;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'N' && dir2 == 'W') {
        if (bIn < 45 && bIn >= 0) {
          if (bIn == 0){
            System.out.println("Compass N0W is a bearing of 0");
          } else {
            int a1 = (-1*bIn) + 360;
            System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
          }
        } else {
          System.out.println("Invalid");
        }
      } else {
        System.out.println("Invalid");
      }
    } else if (direction.length() == 4) {
      char dir1 = direction.charAt(0);
      char bIn1 = direction.charAt(1);
      char bIn2 = direction.charAt(2);
      int bIn = ((bIn1 - '0') * 10) + (bIn2 - '0');
      char dir2 = direction.charAt(3);

      if (dir1 == 'N' && bIn == 45 && dir2 == 'E') {
        System.out.println("Compass N45E is a bearing of 45");
      } else if (dir1 == 'E' && bIn == 45 && dir2 == 'N') {
        System.out.println("Compass E45N is a bearing of 45");
      } else if (dir1 == 'S' && bIn == 45 && dir2 == 'E') {
        System.out.println("Compass S45E is a bearing of 135");
      } else if (dir1 == 'E' && bIn == 45 && dir2 == 'S') {
        System.out.println("Compass E45S is a bearing of 135");
      } else if (dir1 == 'S' && bIn == 45 && dir2 == 'W') {
        System.out.println("Compass S45W is a bearing of 225");
      } else if (dir1 == 'W' && bIn == 45 && dir2 == 'S') {
        System.out.println("Compass W45S is a bearing of 225");
      } else if (dir1 == 'N' && bIn == 45 && dir2 == 'W') {
        System.out.println("Compass N45W is a bearing of 315");
      } else if (dir1 == 'W' && bIn == 45 && dir2 == 'N') {
        System.out.println("Compass W45N is a bearing of 315");
      } else if (dir1 == 'N' && dir2 == 'E') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 0;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'E' && dir2 == 'N') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 90;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'E' && dir2 == 'S') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 90;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'S' && dir2 == 'E') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 180;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'S' && dir2 == 'W') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 180;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'W' && dir2 == 'S') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = (-1*bIn) + 270;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'W' && dir2 == 'N') {
        if (bIn < 45 && bIn >= 0) {
          int a1 = bIn + 270;
          System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
        } else {
            System.out.println("Invalid");
        }
      } else if (dir1 == 'N' && dir2 == 'W') {
        if (bIn < 45 && bIn >= 0) {
          if (bIn == 0){
            System.out.println("Compass N0W is a bearing of 0");
          } else {
            int a1 = (-1*bIn) + 360;
            System.out.println("Compass " + dir1 + bIn + dir2 + " is a bearing of " + a1);
          }
        } else {
          System.out.println("Invalid");
        }
      } else {
        System.out.println("Invalid");
      }
    } else if (direction.equalsIgnoreCase("N")) {
      System.out.println("Compass N is a bearing of 0");
    } else if (direction.equalsIgnoreCase("NE")) {
      System.out.println("Compass NE is a bearing of 45");
    } else if (direction.equalsIgnoreCase("E")) {
      System.out.println("Compass E is a bearing of 90");
    } else if (direction.equalsIgnoreCase("SE")) {
      System.out.println("Compass SE is a bearing of 135");
    } else if (direction.equalsIgnoreCase("S")) {
      System.out.println("Compass S is a bearing of 180");
    } else if (direction.equalsIgnoreCase("SW")) {
      System.out.println("Compass SW is a bearing of 225");
    } else if (direction.equalsIgnoreCase("W")) {
      System.out.println("Compass W is a bearing of 270");
    } else if (direction.equalsIgnoreCase("NW")) {
      System.out.println("Compass NW is a bearing of 315");
    } else {
      System.out.println("Invalid");
    }
  }
}