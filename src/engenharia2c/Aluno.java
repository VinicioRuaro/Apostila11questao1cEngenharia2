package engenharia2c;

import java.util.List;

public class Aluno {
String RA;

public Aluno(String nome) {
	super();
	this.RA = nome;
	
}

public String getNome() {
	return RA;
}

public void setNome(String nome) {
	this.RA = nome;
}

public boolean verficaAluno()
{   //Se o RA � null � retorna erro - m�todo aleat�rio
	String alunossString = LeitorArquivos.leitorArquivoString("Z:\\Alunos.txt");
        String alunos[] = alunossString.split(";");
        
        for(int a=1;a<alunos.length;a++){
            
            if(alunos[a].equals(RA)){
                System.out.println("B");
                return true;
            }
        }
	return false;
}

public boolean verificaDebito()
{       //instancia um objeto d�bito
        Debito debito = new Debito( Integer.parseInt(this.RA)); 
	/* Aqui voc� deve chamar o metodo verificaDebito da classe debito*/
        if(debito.verificaDebito()){
    return false;
        }
        else{
            return true;
        }
}

//Metodo que delega a funcionalidade de emprsestar para a classe emprestimo
public boolean emprestar(List<Livro> livros)
{   /* Aqui voc� deve intanciar um objeto emprestimo */
    Emprestimo emprestimo = new Emprestimo();
    emprestimo.emprestar(livros);
    return false;
	/* Aqui voc� deve chamar o metodo emprestar da classe empresitmo*/
	
	
	
}
}
