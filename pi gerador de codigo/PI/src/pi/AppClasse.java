package pi;

public class AppClasse {
private String nome;
private String type = "classe";

public String getType() {
	return type;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String codigo(){
	return "public class "+nome+" {";
}

}
