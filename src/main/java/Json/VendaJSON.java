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
import tp.poo.cinema.Venda;

/**
 * A classe VendaJSON é responsável por salvar informações de vendas em um arquivo JSON.
 */
public class VendaJSON {
    
    /** O caminho do arquivo onde as vendas serão salvas em formato JSON. */
    public static final String Venda = "C:/Users/arthu/OneDrive/Documentos/NetBeansProjects/mavenproject2/src/main/java/Json/Venda.json";

    /** Construtor padrão da classe VendaJSON. */
    public VendaJSON() {}

    /**
     * Salva a lista de vendas em formato JSON no arquivo especificado.
     *
     * @param vendas a lista de vendas a ser salva
     */
    public static void salvarVenda(List<Venda> vendas) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(vendas);

        try (FileWriter writer = new FileWriter(Venda)) {
            writer.write(json);
            System.out.println("Vendas salvas com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar vendas!");
        }
    }
}