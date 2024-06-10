
package tp.poo.cinema;

/**
 * A classe {@code Funcionario} representa um funcionário de um cinema.
 * Herda atributos e métodos da classe {@code Pessoa}.
 */
public class Funcionario extends Pessoa {

    /**
     * Construtor padrão da classe {@code Funcionario}.
     */
    public Funcionario() {
        // Construtor padrão
    }

    /**
     * Construtor da classe {@code Funcionario} que inicializa os atributos da pessoa.
     * 
     * @param nome o nome do funcionário
     * @param sobrenome o sobrenome do funcionário
     * @param cpf o CPF do funcionário
     * @param endereco o endereço do funcionário
     * @param telefone o telefone do funcionário
     * @param nomeUsuario o nome de usuário do funcionário
     * @param senha a senha do funcionário
     */
    public Funcionario(String nome, String sobrenome, String cpf, String endereco, String telefone, String nomeUsuario, String senha) {
        super(nome, sobrenome, cpf, endereco, telefone, nomeUsuario, senha);
    }

    /**
     * Retorna uma representação textual do funcionário.
     * 
     * @return uma string que representa o funcionário
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", nomeUsuario='" + getNomeUsuario() + '\'' +
                ", senha='" + getSenha() + '\'' +
                '}';
    }
}
