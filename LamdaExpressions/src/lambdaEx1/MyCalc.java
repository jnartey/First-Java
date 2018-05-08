package lambdaEx1;

public class MyCalc<T> {
	
	private MyCalcInterface<Integer> sum;
	private MyCalcInterface<Integer> subtract;
	private MyCalcInterface<Float> multiply;
	private MyCalcInterface<Float> divide;
	
	public MyCalc() {
		this.sum = (num1, num2) -> num1 + num2;
		this.subtract = (num1, num2) -> num1 - num2;
		this.multiply = (num1, num2) -> num1 * num2;
		this.divide = (num1, num2) -> {
			if(num2 == 0) {
				return -1F;
			}else {
				return (num1 / num2);
			}
		};
	}
	
	/**
	 * @return the sum
	 */
	public MyCalcInterface<Integer> getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(MyCalcInterface<Integer> sum) {
		this.sum = sum;
	}


	/**
	 * @return the subtract
	 */
	public MyCalcInterface<Integer> getSubtract() {
		return subtract;
	}

	/**
	 * @param subtract the subtract to set
	 */
	public void setSubtract(MyCalcInterface<Integer> subtract) {
		this.subtract = subtract;
	}

	/**
	 * @return the multiply
	 */
	public MyCalcInterface<Float> getMultiply() {
		return multiply;
	}

	/**
	 * @param multiply the multiply to set
	 */
	public void setMultiply(MyCalcInterface<Float> multiply) {
		this.multiply = multiply;
	}

	/**
	 * @return the divide
	 */
	public MyCalcInterface<Float> getDivide() {
		return divide;
	}

	/**
	 * @param divide the divide to set
	 */
	public void setDivide(MyCalcInterface<Float> divide) {
		this.divide = divide;
	}
	
}
