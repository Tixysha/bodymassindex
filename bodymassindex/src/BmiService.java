public class BmiService {

    public int calculate(int weightKilo, double heightMeters) {
        double bodyMassIndex = weightKilo / ( heightMeters * 2);
        return (int) bodyMassIndex;

    }
}
