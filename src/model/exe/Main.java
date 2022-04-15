
package model.exe;

import java.io.File;
import java.io.IOException;
import java.util.List;
import model.bean.Buscador;
import model.util.Arquivo;

/**
 *
 * @author Pedro Citadin Coelho
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Buscador busc = new Buscador();
        
        long inicio = System.currentTimeMillis();
        busc.pesquisaNome("Margaret Lane", "lista");
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo decorrido: "+tempo+" milissegundos");
        
        
    }
}
