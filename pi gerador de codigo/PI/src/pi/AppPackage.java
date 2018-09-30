package pi;

public class AppPackage {
 private String nome;
 
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
public String codigo(){
	return "package "+nome+";";
}
}
