package lambdaEx1;

@FunctionalInterface
public interface MyCalcInterface<T> {
	public T compute(T num1, T num2);
}
