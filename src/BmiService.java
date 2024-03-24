public class BmiService {

    public int calculate(double heightInMeters, int weightInKilograms) {
        double index = weightInKilograms / heightInMeters / heightInMeters;
        int bmi = (int) index;
        return bmi;
    }
}
