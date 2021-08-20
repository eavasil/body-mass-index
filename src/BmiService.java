public class BmiService {
    public int calculate(float x, float y) {
        float bodyMassIndex = y / (x * x);
        return (int) bodyMassIndex;
    }
}

