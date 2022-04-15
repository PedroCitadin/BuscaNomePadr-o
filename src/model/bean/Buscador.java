package model.bean;

import java.io.File;
import java.io.IOException;
import java.util.List;
import model.util.Arquivo;

/**
 *
 * @author Pedro Citadin Coelho
 */
public class Buscador {

    public List<File> listaArquivos;

    public List<File> getListaArquivos() {
        return listaArquivos;
    }

    public void setListaArquivos(List<File> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    public Buscador() {
    }

    public Buscador(List<File> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    public void pesquisaNome(String nome, String diretorio) throws IOException {
        listaArquivos = Arquivo.pegaTodosOsArquivos(diretorio);
        for (File f : listaArquivos) {
            Arquivo a = new Arquivo(f);
            List<String> listaLinhas = a.pegalistaLinhas(a);
            int contador = 0;
            for (String linha : listaLinhas) {

                contador++;

                if (linha.equalsIgnoreCase(nome)) {
                    System.out.println("Encontrado no arquivo: " + a.getNome() + " na linha: " + contador);
                }

            }
        }

    }

}
