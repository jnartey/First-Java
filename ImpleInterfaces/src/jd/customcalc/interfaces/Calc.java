package jd.customcalc.interfaces;

@FunctionalInterface
public interface Calc<T> {
	public T compute(Integer[] numbers);
}
