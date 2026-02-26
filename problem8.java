import java.text.NumberFormat;

public class problem8 {
    public static void main(String[] args) {
    NumberFormat percent = NumberFormat.getPercentInstance();
    String result = percent.format(.1);
    System.out.println(result);
    }
}
