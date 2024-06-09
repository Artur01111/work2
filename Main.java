public class Main {
    public static void main(String[] args) {
        double[] numbers = {4, 2, -2, 4, -2, 3, -6, 7, -5, 52, -3, 4, -9, 5, -11};
        boolean negative = false;
        double summa = 0;
        int count = 0;
        for (double number : numbers) {
            if (number < 0 && !negative) {
                negative = true;
            } else if (number > 0 && negative) {
                summa += number;
                count++;
            }
        }
        double average = summa / count;
        System.out.println("Среднее арифметическое: " + average);

    }
}
