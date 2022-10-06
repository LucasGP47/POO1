package ListaLucas;

public class salario {
	
	private float sH;
	private float hT;
	
	float num1 = sH;
	float num2 = hT;
	
	public float bruto(float num1, float num2) {
    	
	    float bruto = num1 * num2;
	    
			return bruto;
			
	}
	    
	public float INSS(float num1, float num2) {
	    	
	        float INSS = (num1 * num2) * 8/100;
	        
	    		return INSS;
	    		
	    	}
	 
	public float sindicato(float num1, float num2) {
		
		float sindicato = (num1 * num2) * 5/100;
		
		return sindicato;
		
	}
	
    public float liquid(float num1, float num2) {
		
		float liquid = ((num1 * num2) - ((num1 * num2) * 11/100)) - ((num1 * num2) * 5/100) - ((num1 * num2) * 8/100);
		
		return liquid;
		
	}
	
 
	
}
