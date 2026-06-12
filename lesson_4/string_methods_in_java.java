package lesson_4;

public class string_methods_in_java {
    public static void main(String[] args) {
        String first = "Cod";
        String second = "ingal";
        String codingal = first + second;
        String codingalTrick = "Welcome" + "to" + "Codingal";
        String codingalCapital = codingal.toUpperCase();
        String codingalSmall = codingal.toLowerCase();

        int lengthofCodingal = codingal.length();
        int lengthofCodingalTrick = codingalTrick.length();
        int sum = lengthofCodingal + lengthofCodingalTrick;

        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}