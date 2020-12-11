package engenharia2c;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
            
                 String emprestimoString = LeitorArquivos.leitorArquivoString("Z:\\Emprestimos.txt");
                 
		 Entrada entrada = new Entrada();
                 entrada.eu=entrada;
                 entrada.setVisible(true);
		 Scanner entradat = new Scanner (System.in);
		 int[] codigos= {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 System.out.print("Digite o RA do Aluno: ");
		 String aluno = entradat.nextLine();
		 System.out.print("Digite o numero de Livros a ser Emprestado: ");
		 int num = entradat.nextInt();
		 int aux;
		 for(int i=0;i<num;i++)
		 {
			 System.out.print("Digite o codigo do livro "+i+":");
			 aux=entradat.nextInt();
			 codigos[i]=aux;
		 }
		 
        Controle c = new Controle();
        c.emprestar(aluno, codigos, num);
            
    		 
	}

}
