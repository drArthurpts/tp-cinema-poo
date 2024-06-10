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
import tp.poo.cinema.Funcionario;
import tp.poo.cinema.Funcionario;


/**
 * A classe FuncionarioJSON é responsável por salvar informações de funcionários em um arquivo JSON.
 */
public class FuncionarioJSON {
    
    /** O caminho do arquivo onde os funcionários serão salvos em formato JSON. */
    public static final String Funcionario = "C:/Users/arthu/OneDrive/Documentos/NetBeansProjects/mavenproject2/src/main/java/Json/Funcionario.json";
    
    /** Construtor privado para evitar instâncias desnecessárias da classe. */
    private FuncionarioJSON() {
        
    }

    /**
     * Salva a lista de funcionários em formato JSON no arquivo especificado.
     *
     * @param funcionarios a lista de funcionários a ser salva
     */
    public static void salvarFuncionario(List<Funcionario> funcionarios) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(funcionarios);

        try (FileWriter writer = new FileWriter(Funcionario)) {
            writer.write(json);
            System.out.println("Funcionarios salvos com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar Funcionários!");
        }
    }
}