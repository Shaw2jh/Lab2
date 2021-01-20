import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    // Variables
    int total;
    double blue, brown, green, orange, red, yellow, sum;

    // Calculation
    total = 55 * 9;
    blue = total * .24;
    brown = total * .13;
    green = total * .16;
    orange = total * .20;
    red = total * .13;
    yellow = total * .14;
    sum = blue + brown + green + orange + red + yellow;
    
    // Print out
    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " + yellow);
    System.out.println("Sum: " + sum);
    System.out.println("total: " + total);
    // if statements
    if (blue > brown && green > red) {
      System.out.println("Blue over Brown and Green over Red");
    }
    if (brown <= orange) {
      System.out.println("Brown is less than or equal to Orange");
    }
    if (sum == total) {
      System.out.println("Numbers match");

      
    
    }

  }
}