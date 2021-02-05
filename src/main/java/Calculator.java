public class Calculator {
    public int compute(int num1, int num2, String symbol) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Computable compute = ComputeFactory.getCompute(symbol);
        return compute.compute(num1, num2);

    }
}
