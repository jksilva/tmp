package pi;

public class AppVar {
	private String nome="var";
	private String valor=null;
	private String acesso="public";
	private String tipo="String";
	
	public String getAcesso() {
		return acesso;
	}
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String codigo(){
		return acesso+" "+tipo+" "+nome+" = "+valor+";";
	}
	
}

