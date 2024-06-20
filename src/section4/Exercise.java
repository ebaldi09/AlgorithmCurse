package section4;

public class Exercise {

    public static void main(String[] args) {
        double[] valores = new double[10];
        setValues(valores);
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        double average = 0;
        Result result = getResult(valores, maxValue, minValue, average);

        System.out.println("Max: " + result.maxValue());
        System.out.println("Min: " + result.minValue());
        System.out.print("Average : " + (result.average() /valores.length));
    }

    private static Result getResult(double[] valores, double maxValue, double minValue, double average) {
        for (int i = 0; i < 10; i++) {
            if(valores[i] > maxValue) maxValue = valores[i];
            if(valores[i] < minValue) minValue = valores[i];
            average += valores[i];
        }
        return new Result(maxValue, minValue, average);
    }

    private record Result(double maxValue, double minValue, double average) {
    }

    private static void setValues(double[] valores) {
        for (int i = 0; i < 10; i++) {
            valores[i] = Math.random();
            System.out.println(valores[i]);
        }
    }

}
