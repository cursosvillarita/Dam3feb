public class operaciones {
	private int a;
	private int b;
	public  operaciones (int a, int b) {
	this.a = a;
	this.b = b;
	}
	public int suma() {
	return a + b;
	}
	/*public int resta() {
	return a - b;
	}*/
	public double división() {
		if (a==0) System.out.println("no");
	return (double)a / b;
	}
	public int multiplicación() {
	return a * b;
}
}
