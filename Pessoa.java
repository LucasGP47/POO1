package ListaLucas;

public class Pessoa {
       
	private String nome; 
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome) {
	
		setNome(nome);
		setSobrenome(sobrenome);
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
 	
    public String getSobrenome() {
    	return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
		if (nome.length() > 0)
			this.sobrenome = sobrenome;
	}
	
    public String nomeCompleto(String nome, String sobrenome) {
    	
    	String nomeCompleto = nome + " " + sobrenome;
    	
    	return nomeCompleto;
    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();
	}
	
	
	
	
}
