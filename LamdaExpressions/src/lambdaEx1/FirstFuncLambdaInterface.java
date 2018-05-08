package lambdaEx1;

@FunctionalInterface
public interface FirstFuncLambdaInterface {
	public String sayHello();
	
	public default void sayHello11() {
		System.out.println("Say Hello Again");
	}
}
