public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMass = 80;
        float height = 1.75F;
        float bodyMassIndex = service.calculate(height, bodyMass);
        System.out.println(bodyMassIndex);

        float bodyMass1 = 80;
        float height1 = 2;
        float bodyMassIndex1 = service.calculate(height1, bodyMass1);
        System.out.println(bodyMassIndex1);

        float bodyMass2 = 40;
        float height2 = 1.75F;
        float bodyMassIndex2 = service.calculate(height2, bodyMass2);
        System.out.println(bodyMassIndex2);
    }
}