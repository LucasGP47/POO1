package ListaLucas;


public class numero {

	private int num1;
	private int num2;
	
	public numero(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	


	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public String toString() {
		
		StringBuilder intervalo = new StringBuilder();
	
		for(int x = num1 + 1; x < num2; x++){
			
			intervalo.append(x + "; ");
		}
		
		return intervalo.toString();
	}
	
	
	
	
}
