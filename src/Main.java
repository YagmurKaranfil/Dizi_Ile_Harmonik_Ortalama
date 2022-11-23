public class Main {
    public static void main(String[] args) {

        double harmonikOrtalama=0.0;
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            harmonikOrtalama=harmonikOrtalama+1.0/numbers[i];
        }
       harmonikOrtalama = numbers.length/harmonikOrtalama;

        System.out.println("Harmonik ortalama : "+harmonikOrtalama);
    }
}