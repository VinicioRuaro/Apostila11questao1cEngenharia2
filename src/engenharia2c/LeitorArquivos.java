package engenharia2c;
import java.io.*;
import java.util.ArrayList;

public class LeitorArquivos {
    
    public static String leitorArquivoString(String lugar){
    String linha = new String();
    String nomeArquivo = lugar;
    
    File arq = new File(nomeArquivo);
    ArrayList<String> arquivo = new ArrayList<>();
    
    if(arq.exists() ){
        try {
            
            FileReader leitorDeArquivo = new FileReader(nomeArquivo);
            BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
            
            while(true){
                linha = bufferDeArquivo.readLine();
                if(linha==null){
                    break;
                }
                arquivo.add(linha);
                
                
            }
           
        } catch (Exception e) {
        }
        
        int a = 0 ;
        for(String nome : arquivo){
            a++;
        }
        
        String saida = new String();
        saida = "";
        for(int b = 0;b<a;b++){
            saida = saida + arquivo.get(b)+"\n";
        }    
        
        return saida;
    }
        return null;
   }
}