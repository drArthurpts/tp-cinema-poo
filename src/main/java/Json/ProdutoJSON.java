/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.time.format.DateTimeFormatter;
import tp.poo.cinema.Produto;


/**
 * A classe ProdutoJSON é responsável por salvar informações de produtos em um arquivo JSON.
 */
public class ProdutoJSON {
    
    /** O caminho do arquivo onde os produtos serão salvos em formato JSON. */
    public static final String Produto = "C:/Users/arthu/OneDrive/Documentos/NetBeansProjects/mavenproject2/src/main/java/Json/Produto.json";
    
    /** Construtor privado para evitar instâncias desnecessárias da classe. */
    private ProdutoJSON() {}
    
    /**
     * Salva a lista de produtos em formato JSON no arquivo especificado.
     *
     * @param produtos a lista de produtos a ser salva
     */
    public static void salvarProdutos(List<Produto> produtos) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(produtos);

        try (FileWriter writer = new FileWriter(Produto)) {
            writer.write(json);
            System.out.println("Produtos salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar produtos!");
        }
    }
}