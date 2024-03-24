public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double heightInMeters = 1.65;
        int weightInKilograms = 65;
        int bmi = service.calculate(heightInMeters, weightInKilograms);
        System.out.println("Индекс массы тела равен " + bmi);
    }
}