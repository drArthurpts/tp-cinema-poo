package tp.poo.cinema;

import Json.FuncionarioJSON;
import Json.ClienteJSON;
import Json.ProdutoJSON;
import Json.VendaJSON;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Program {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Cinema cinema = new Cinema();
        Login login = new Login();
        Carrinho carrinho = new Carrinho();
        Balcao b1 = new Balcao();
        GestaoFilmes gestaoFilmes = new GestaoFilmes();
        Sala sala = new Sala(20, 20);
        List<Venda> vendas = new ArrayList<>();
        CRUDpessoas<Pessoa> crudPessoas = new CRUDpessoas<>();

        //Questão 1: no Latex
        //Criando um Funcionário
        Funcionario f1 = new Funcionario("Luiz", "Inácio", "3536567474", "Rua 1, Bairro Bom Jesus", "3824245356", "luiz", "1234567");
        crudPessoas.addPessoa(f1);
        Propietario p = new Propietario("Jean", "Macedo", "545455655", "Rua Mariana Higina, Largo dom Joao", "3895745784", "jean", "7654321");
        cinema.cadastrarFuncionario(f1);
        crudPessoas.addPessoa(p);
        FuncionarioJSON.salvarFuncionario(cinema.imprimirListaFuncionario());

        //Questão 2
        login.adUsuario(f1);
        login.login("luiz", "1234567");
        login.adUsuario(p);
        login.login("jean", "7654321");

        //Questão 3: os métodos toString() estão implementados em todas as classes do Sistema
        //Questao 4: a palavra-chave super foi usada nos construtores das Classes Cliente, Funcionario , Propietario e CRUDPessoas que herdam a classe Pessoa.E na classe Alimento que herda a classe produto
        //Questao 5: Os 5 balcões estão implementados de forma estática a partir da linha 60 na classe Cinema.Java
        
        //Questao 6 e 7
        Pessoa pessoa = crudPessoas.getPessoa("3536567474");

        // Altere uma pessoa
        pessoa.setNome("Novo Nome");
        crudPessoas.updatePessoa(pessoa);

        // Exclua uma pessoa
        crudPessoas.deletePessoa("123.456.789-00");

        // Obtenha todas as pessoas
        List<Pessoa> todasPessoas = crudPessoas.getAllPessoas();

        System.out.println(pessoa);

        // Criando um cliente
        Cliente c1 = new Cliente("Arthur", "Abreu", "1380574575", "Rua 1, Bairro Fatima", "38997312653", "Matheus", "7654321");
        Cliente c2 = new Cliente("Victor", "Rodrigues", "456474575", "Rua 1, Bairro Bom Jeusus", "38997312653", "Matheus", "7654321");

        //Adicionar clientes e funcionários a uma lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(c1);
        pessoas.add(c2);
        pessoas.add(f1);
        pessoas.add(p);

//        // Questao 15
//        // Usar um iterator para percorrer a lista de pessoas
//        Iterator<Pessoa> iterator = pessoas.iterator();
//        System.out.println("Usando Iterator:");
//        while (iterator.hasNext()) {
//            Pessoa pessoap = iterator.next();  // Declare a variável aqui
//            imprimir(pessoap);
//        }
//
//        // Usar foreach para percorrer a lista de pessoas
//        System.out.println("\nUsando foreach:");
//        for (Pessoa pessoap : pessoas) {  // Declare a variável aqui
//            imprimir(pessoap);
//        }
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);

        // Ordenar a lista de clientes pelo CPF
        clientes.sort(Comparator.comparing(Cliente::getCpf));
        
        //Questão 17
        // Usar o método find
        Cliente foundCliente = findClienteByCpf(clientes, "1380574575");
        System.out.println("Cliente encontrado usando find: " + foundCliente.getNome());

        // Usar binarySearch
        int index = Collections.binarySearch(clientes, new Cliente("", "", "1380574575", "", "", "", ""), Comparator.comparing(Cliente::getCpf));
        if (index >= 0) {
            Cliente binaryFoundCliente = clientes.get(index);
            System.out.println("Cliente encontrado usando binarySearch: " + binaryFoundCliente.getNome());
        } else {
            System.out.println("Cliente não encontrado usando binarySearch.");
        }

        //Questao 9: toda vez q chamo esse método ele salva o cliente de forma dinâmica
        cinema.cadastrarCliente(c1);
        ClienteJSON.salvarClientes(cinema.imprimirListaCliente());

        // Adicionando Alimentos no Estoque e Verificando Validade
        Alimentos pipoca = new Alimentos("Pipoca", LocalDate.of(2025, 11, 21), 15.00);
        Alimentos refri = new Alimentos("Refrigerante", LocalDate.of(2022, 11, 21), 9.00);
        cinema.cadastrarProduto(refri);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(pipoca);
        estoque.adicionarProduto(refri);
        estoque.verificarValidadeProdutos();

        //Questao 11 
        System.out.println("Número de instâncias de Cliente : " + Cliente.getInstanciaCount());
        /*
        * Na classe Cliente tem outra variável com a mesma função, só que protected. Vantagens de usar o private é a Segurança, pois o acesso à variável é controlado, permitindo que apenas métodos específicos possam modificá-la. Isso previne alterações indesejadas e mantém a integridade dos dados.
        * Desvantegem de usar o private é a maior complexidade pois requer métodos adicionais (get e set), o que aumenta a quantidade de código e pode parecer excessivo para variáveis simples e de desempenho, pois pode haver uma ligeira sobrecarga de desempenho devido à chamada de métodos adicionais, embora geralmente seja insignificante.
        * Vantagens de usar o protected , Simplicidade: As variáveis podem ser acessadas diretamente sem a necessidade de métodos adicionais, tornando o código mais concisoe o Desenpenho: Acesso direto às variáveis pode ser ligeiramente mais rápido do que através de métodos.
         */
        // Questão 12 obs:As variáveis estão criadas na classe Cinema
        System.out.println(Cinema.obterQuantidadeInstancias());

        //Colocando Filmes no Cartaz
        gestaoFilmes.adicionarFilme(new Filme("Os Vingadores", "Ação"));
        gestaoFilmes.adicionarFilme(new Filme("A Freira", "Terror"));

        // Lista de Filmes
        List<Filme> filmes = gestaoFilmes.getFilmes();

        //Questão 13
//         // Ordenar por Gênero
//        Collections.sort(filmes, Filme.CompararPorGenero);
//        System.out.println("\nFilmes ordenados por Gênero:");
//        for (Filme filme : filmes) {
//            System.out.println(filme);
//        }
//
//        // Ordenar por Preço
//        Collections.sort(filmes, Filme.CompararPorPreco);
//        System.out.println("\nFilmes ordenados por Preço:");
//        for (Filme filme : filmes) {
//            System.out.println(filme);
//        }
//        
//      
        // Criação de um extrato de venda
        ExtratoVenda extrato = new ExtratoVenda(c1);

        // Seleção do balcão
        Balcao balcaoSelecionado = carrinho.selecionarBalcao(cinema, extrato.getValorTotal());

        // Seleção de produtos
        List<Produto> produtosSelecionados = new ArrayList<>();
        Produto produtoSelecionado = carrinho.selecionarProduto(estoque);
        int quantProduto = carrinho.getSelecao();
        if (produtoSelecionado != null) {
            produtosSelecionados.add(produtoSelecionado);
        }

        // Seleção de filme
        Filme filmeSelecionado = carrinho.selecionarFilme(gestaoFilmes);
        int quantIngressos = carrinho.selecionarQuantIngressos();

        // Adição dos itens vendidos ao extrato de venda
        for (Produto produto : produtosSelecionados) {
            extrato.adicionarItemVenda(new ItemVenda(produto.getNome(), produto.getPreco(), quantProduto)); // 1 unidade de cada produto
        }

        // Adicionando ingressos ao extrato
        if (filmeSelecionado != null) {
            extrato.adicionarItemVenda(new ItemVenda(filmeSelecionado.getTitulo(), filmeSelecionado.getPreco(), quantIngressos));
        }

        // Reserva de assentos
        sala.mostrarAssentos();
        sala.reservarAssentos();

        // Finalização da venda e impressão do extrato
        if (balcaoSelecionado != null) {
            balcaoSelecionado.adicionarVenda(extrato.getValorTotal());
            System.out.println("Venda realizada com sucesso!");

            //Questao 8 e 10
            // Impressão do extrato de venda
            extrato.imprimirExtrato();

            // Salvar o extrato, se necessário
            try (PrintWriter out = new PrintWriter(new FileWriter("extrato.txt", true))) {
                out.println(extrato);
            } catch (IOException e) {
                System.out.println("Erro ao salvar o extrato.");
            }
        } else {
            System.out.println("Venda não pode ser realizada. Balcão não selecionado.");
        }

        vendas.add(new Venda(c1, balcaoSelecionado, produtoSelecionado, filmeSelecionado, quantIngressos));

        //Questão 13
//        // Ordenar vendas pelo valor total
//        Collections.sort(vendas, Venda.CompararPorValorTotal);
//
//        // Exibir vendas ordenadas
//        System.out.println("Vendas ordenadas por valor total:");
//        for (Venda venda : vendas) {
//            System.out.println("Cliente: " + venda.getCliente().getNome() + ", Valor Total: R$ " + venda.getValorTotal());
//        }
        // Crie uma instância de VendaJSON
        VendaJSON vendaJSON = new VendaJSON();

        VendaJSON.salvarVenda(vendas);

    }

    // Método para imprimir informações da pessoa
    public static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Tipo: " + (pessoa instanceof Cliente ? "Cliente" : "Funcionario"));
        System.out.println("-----------");
    }

    public static Cliente findClienteByCpf(List<Cliente> clientes, String cpf) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

}
