package engenharia2c;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarArquivos {

  public static void gravar(String entrada,String lugar) throws IOException {
    
    String leitura =LeitorArquivos.leitorArquivoString(lugar);
    FileWriter arq = new FileWriter(lugar);
    PrintWriter gravarArq = new PrintWriter(arq);
    
    gravarArq.printf(leitura+entrada);
    arq.close();

    
  }

}