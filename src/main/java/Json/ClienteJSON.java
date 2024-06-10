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
import tp.poo.cinema.Cliente;


/**
 * A classe ClienteJSON é responsável por salvar informações de clientes em um arquivo JSON.
 */
public class ClienteJSON {
    
    /** O caminho do arquivo onde os clientes serão salvos em formato JSON. */
    public static final String Cliente = "C:/Users/arthu/OneDrive/Documentos/NetBeansProjects/mavenproject2/src/main/java/Json/Cliente.json";
    
    /** Construtor privado para evitar instâncias desnecessárias da classe. */
    private ClienteJSON() {}

    /**
     * Salva a lista de clientes em formato JSON no arquivo especificado.
     *
     * @param clientes a lista de clientes a ser salva
     */
    public static void salvarClientes(List<Cliente> clientes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(clientes);

        try (FileWriter writer = new FileWriter(Cliente)) {
            writer.write(json);
            System.out.println("Clientes salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar clientes!");
        }
    }
}