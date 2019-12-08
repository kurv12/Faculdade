package loja;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int op = 0;

        Loja padaria = new Loja();
        padaria.nome = "Padaria";

        Cliente c1 = new Cliente("Jose Joao", "Rua 10, 11, Bairro 12", "256987451-42", "999995555", 0);
        Cliente c2 = new Cliente("Maria", "Rua 13, 10, Bairro 22", "54895314-85", "988885544", 0);

        Gerente g = new Gerente("Jose Chefe", "Rua 10, 11, Bairro 12", "256987451-42", 3000, 0);
        Vendedor v1 = new Vendedor("Paulo Vendedor", "Rua 13, 10, Bairro 22", "445879584-72", 1500, 0, false);
        Vendedor v2 = new Vendedor("Marcos Vendedor", "Rua 45, 12, Bairro 50", "454127845-95", 1500, 0, false);
        Vendedor v3 = new Vendedor("Caio Vendedor", "Rua 77, 10, Bairro 80", "445123568-90", 1500, 0, false);
        Padeiro p = new Padeiro("Tony Padeiro", "Rua do Pao, 12, Bairro 20", "454123589-11", 2000, 0, 0);

        padaria.gerentes.add(g);
        padaria.vendedores.add(v1);
        padaria.vendedores.add(v2);
        padaria.vendedores.add(v3);
        padaria.padeiros.add(p);

        do {
            System.out.println("------------------------");
            System.out.println("Padaria do Jorge Padeiro");
            System.out.println("----------Menu:---------");
            System.out.println("1 - Vendas");
            System.out.println("2 - Gest�o de Clientes");
            System.out.println("3 - Gest�o de Funcion�rios");
            System.out.println("4 - Estoque");
            System.out.println("5 - Gest�o de Informa��es");
            System.out.println("6 - Gest�o de Impostos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma op��o:");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    carregarMenuVendas(leitor, padaria);
                    break;
                case 2:
                    carregarMenuCliente(leitor, padaria);
                    break;
                case 3:
                    carregarMenuFuncionarios(leitor, padaria);
                    break;
                case 4:
                    carregarMenuEstoque(leitor, padaria);
                    break;
                case 5:
                    break;
                case 6:
                    carregarMenuImpostos(leitor, padaria);
                    break;
                default:
                    break;
            }

        } while (op != 0);

    }

    public static void carregarMenuVendas(Scanner leitor, Loja padaria) {
        int opVenda = 0;

        do {
            System.out.println("----Menu de Vendas----");
            System.out.println("1 - Cadastrar Venda");
            System.out.println("Digite a op��o desejada: ");
            opVenda = leitor.nextInt();

            switch (opVenda) {
                case 1:
                    // cadastrarVenda
                    break;

                default:
                    break;
            }

        } while (opVenda != 0);
    }

    public static void carregarMenuCliente(Scanner leitor, Loja padaria) {
        int opCliente = 0;
        int idCliente = 0;
        Cliente instancia;

        do {
            System.out.println("----Menu de Clientes----");
            System.out.println("1 - Listar Clientes");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Editar Cliente");
            System.out.println("4 - Tornar Clien0te Gold");
            System.out.println("5 - Tornar Cliente Platinum");
            System.out.println("0 - Voltar");
            System.out.println("Digite a op��o desejada: ");
            opCliente = leitor.nextInt();

            switch (opCliente) {
                case 1:
                    listarClientes(padaria);
                    break;
                case 2:
                    leitor.nextLine();
                    Cliente cliente = cadastrarCliente(leitor);
                    cliente.id = padaria.clientes.size();
                    padaria.clientes.add(cliente);
                    break;
                case 3:
                    // editarCliente
                    break;
                case 4:
                    listarClientes(padaria);
                    System.out.println("Digite o id do Cliente a ser tornado Gold: ");
                    idCliente = leitor.nextInt();
                    instancia = padaria.clientes.get(idCliente);
                    tornarClienteGold(instancia);
                    break;
                case 5:
                    listarClientes(padaria);
                    System.out.println("Digite o id do Cliente a ser tornado Platinum: ");
                    idCliente = leitor.nextInt();
                    instancia = padaria.clientes.get(idCliente);
                    tornarClienteGold(instancia);
                    break;
                default:
                    break;
            }

        } while (opCliente != 0);
    }

    public static void carregarMenuFuncionarios(Scanner leitor, Loja padaria) {
        int opFuncionario = 0;
        do {
            System.out.println("----Menu de Funcion�rios----");
            System.out.println("1 - Listar Funcion�rios");
            System.out.println("2 - Cadastrar Funcion�rio");
            System.out.println("3 - Editar Funcion�rio");
            System.out.println("4 - Registrar alcance de meta de vendas para Funcion�rio");
            System.out.println("0 - Voltar");
            switch (opFuncionario) {
                case 1:
                    // listarFuncionarios
                    break;
                case 2:
                    // cadastrarFuncionario
                    break;
                case 3:
                    // EditarFuncionario
                    break;
                case 4:
                    baterMetaFuncionario(padaria, leitor);
                    break;
            }
        } while (opFuncionario != 0);

    }

    public static void carregarMenuEstoque(Scanner leitor, Loja padaria) {
        int opEstoque = 0;
        do {
            System.out.println("----Gest�o de Estoque----");
            System.out.println("1 - Listar Fornecedores");
            System.out.println("2 - Cadastrar Fornecedor");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Cadastrar Produto");
            System.out.println("0 - Voltar");
            System.out.println("Digite a op��o desejada: ");
            opEstoque = leitor.nextInt();

            switch (opEstoque) {
                case 1:
                    listarFornecedores(padaria);
                    break;
                case 2:
                    Fornecedor f = cadastrarFornecedor(leitor);
                    int id = padaria.fornecedores.size();
                    f.setId(id);
                    padaria.fornecedores.add(f);
                    break;
                case 3:
                    listarProdutos(padaria);
                    break;
                case 4:
                    cadastrarProduto(leitor, padaria);
                    break;
                default:
                    break;
            }

        } while (opEstoque != 0);
    }

    public static void carregarMenuInformacoes(Scanner leitor, Loja padaria) {
        int opInformacoes = 0;

        do {
            System.out.println("----Gest�o de Informa��es----");
            System.out.println("1 - Imprimir Relat�rio Geral");
            System.out.println("2 - Imprimir Relat�rio Individual");
            System.out.println("0 - Voltar");
            System.out.println("Digite a op��o desejada: ");
            opInformacoes = leitor.nextInt();

            switch (opInformacoes) {
                case 1:
                    carregarMenuRelatorios(padaria);
                    break;

                default:
                    break;
            }

        } while (opInformacoes != 0);
    }

    public static void carregarMenuImpostos(Scanner leitor, Loja padaria) {
        int opImpostos = 0;
        do {
            System.out.println("----Gest�o de Impostos----");
            System.out.println("1 - Calcular Impostos");
            System.out.println("0 - Voltar");
            System.out.println("Digite a op��o desejada: ");
            opImpostos = leitor.nextInt();
            
            switch(opImpostos){
                case 1:
                    Imposto m = new Imposto();
                    for(Funcionario f : padaria.funcionarios){
                        System.out.println("Funcionario: " + f.getNome() + " com " + m.calcularImpostoFuncionarios(f) + " de impostos." );
                    }
                    for(Venda f : padaria.vendas){
                        System.out.println("Vendedor: " + f.Vendedor.getNome() + " com " + m.calcularImpostoVendas(f) + " de impostos sobre a venda do dia" 
                                + f.getDataVenda() );
                    }
                    break;
                    
                default:
                    break;
            }
            
        } while (opImpostos != 0);

    }

    // Menus Auxiliares
    /*public static void carregarMenuFornecedores(Scanner leitor, Loja padaria) {
        int opFornecedores = 0;
        do {
            System.out.println("----Menu de Fornecedores----");
            System.out.println("1 - Listar Fornecedores");
            System.out.println("2 - Cadastrar Fornecedor");
            System.out.println("3 - Editar Fornecedor");
            System.out.println("0 - Voltar");
            System.out.println("Digite a op��o desejada: ");
            opFornecedores = leitor.nextInt();

            switch (opFornecedores) {
                case 1:
                    for (Cliente c : padaria.clientes) {
                        System.out.printf("%d - %s \n", c.id, c.getNome());
                    }
                    break;

                case 2:
                    leitor.nextLine();
                    Fornecedor fornecedor = cadastrarFornecedor(leitor);
                    fornecedor.id = padaria.fornecedores.size() + 1;
                    padaria.fornecedores.add(fornecedor);
                    break;

                default:
                    break;
            }

        } while (opFornecedores != 0);
    }*/

    public static void carregarMenuRelatorios(Loja padaria) {

    }

    // M�todos Main
    /*public static void listarClientes(Loja padaria) {
        for (Cliente c : padaria.clientes) {
            System.out.printf("%d - %s ", c.id, c.getNome());
            if (c.getDesconto() == 0) {
                System.out.printf("- Normal \n");
            } else if (c.getDesconto() == 5) {
                System.out.printf("- Gold \n");
            } else if (c.getDesconto() == 10) {
                System.out.printf("- Platinum \n");
            }
        }
    }*/

    /*public static void listarFornecedores(Loja padaria) {
        for (Fornecedor f : padaria.fornecedores) {
            System.out.printf("%d - %s ", f.id, f.getNome());

            if (f.getTaxaDesconto() == 0) {
                System.out.printf("- Ocasional \n");
            } else {
                System.out.printf("- Recorrente \n");
            }
        }
    }*/

    public static void listarProdutos(Loja padaria) {
        System.out.println("Produtos Pereciveis");
        for (ProdutoPerecivel p : padaria.produtosPereciveis) {
            System.out.printf("%d - %s", p.id, p.getNome());
        }
        System.out.println("Produtos N�o-Perec�veis");
        for (ProdutoNaoPerecivel p : padaria.produtosNaoPereciveis) {
            System.out.printf("%d - %s", p.id, p.getNome());
        }
    }

    /*public static void listarFuncionarios(Loja padaria) {
        for (Gerente g : padaria.gerentes) {
            System.out.printf("%d - %s ", g.id, g.getNome());
        }
        for (Vendedor v : padaria.vendedores) {

        }

    }

    public static void tornarClienteGold(Cliente c) {
        c.setDesconto(5);
    }

    public static void tornarClientePlatinum(Cliente c) {
        c.setDesconto(10);
    }

    public static Cliente cadastrarCliente(Scanner leitor) {
        Cliente c = new Cliente();

        System.out.println("Digite o nome do cliente: ");
        c.setNome(leitor.nextLine());
        System.out.println("Digite o endere�o do cliente: ");
        c.setEndereco(leitor.nextLine());
        System.out.println("Digite o CPF do cliente: ");
        c.setCpf(leitor.next());
        System.out.println("Digite o telefone do cliente: ");
        c.setTelefone(leitor.next());

        return c;
    }*/

    /*public static Fornecedor cadastrarFornecedor(Scanner leitor) {

        Fornecedor f = new Fornecedor();
        System.out.println("Digite o tipo do Fornecedor: ");
        System.out.println("1 - Fornecedor Ocasional");
        System.out.println("2 - Fornecedor Recorrente");

        int tipoFornecedor = leitor.nextInt();

        if (tipoFornecedor == 1) {

            leitor.nextLine();
            System.out.println("Digite o nome do Fornecedor: ");
            f.setNome(leitor.nextLine());
            System.out.println("Digite o endere�o do Fornecedor: ");
            f.setEndereco(leitor.nextLine());
            System.out.println("Digite o CNPJ do Fornecedor: ");
            f.setCnpj(leitor.next());
            return f;
        }

        if (tipoFornecedor == 2) {

            System.out.println("Digite o nome do Fornecedor: ");
            f.setNome(leitor.nextLine());
            System.out.println("Digite o endere�o do Fornecedor: ");
            f.setEndereco(leitor.nextLine());
            System.out.println("Digite o CNPJ do Fornecedor: ");
            f.setCnpj(leitor.next());
            System.out.println("Digite a taxa de descontos do Fornecedor: ");
            f.setTaxaDesconto(leitor.nextFloat());
            return f;
        }

        return null;
    }*/

    public static void cadastrarProduto(Scanner leitor, Loja padaria) {
        System.out.println("Digite o tipo do Produto: ");
        System.out.println("1 - Produto Perec�vel");
        System.out.println("2 - Produto N�o-Perec�vel");

        int tipoProduto = leitor.nextInt();
        if (tipoProduto == 1) {
            ProdutoPerecivel p = new ProdutoPerecivel();
            System.out.println("Digite o c�digo do Produto: ");
            p.setCodigo(leitor.nextInt());
            System.out.println("Digite o nome do Produto: ");
            p.setNome(leitor.nextLine());
            System.out.println("Digite o pre�o de custo: ");
            p.setPrecoDeCusto(leitor.nextFloat());
            System.out.println("Digite o apelido (se houver): ");
            p.setApelido(leitor.nextLine());

            // Ler data em String e converter para DateTime
            System.out.println("Digite a data de validade (no formato dd/MM/yyyy");
            String dataValidade = leitor.nextLine();
            DateFormat data = DateFormat.getInstance();
            Date dataVal = new Date();
            try {
                dataVal = data.parse(dataValidade);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            p.setDataValidade(dataVal);

            listarFornecedores(padaria);
            System.out.println("Digite o id do Fornecedor: ");
            int idFornecedor = leitor.nextInt();
            p.setFornecedor(padaria.fornecedores.get(idFornecedor));
            if (p.fornecedor.getTaxaDesconto() != 0) {
                p.precoFinal = p.precoDeCusto - ((p.fornecedor.getTaxaDesconto() / p.precoDeCusto) * 100);
            } else {
                p.precoFinal = p.precoDeCusto;
            }
            p.id = padaria.produtosPereciveis.size();
            padaria.produtosPereciveis.add(p);
        } else if (tipoProduto == 2) {
            ProdutoNaoPerecivel p = new ProdutoNaoPerecivel();
            System.out.println("Digite o c�digo do Produto: ");
            p.setCodigo(leitor.nextInt());
            System.out.println("Digite o nome do Produto: ");
            p.setNome(leitor.nextLine());
            System.out.println("Digite o pre�o de custo: ");
            p.setPrecoDeCusto(leitor.nextFloat());
            System.out.println("Digite o apelido (se houver): ");
            p.setApelido(leitor.nextLine());
            listarFornecedores(padaria);
            System.out.println("Digite o id do Fornecedor: ");
            int idFornecedor = leitor.nextInt();
            p.setFornecedor(padaria.fornecedores.get(idFornecedor));
            if (p.fornecedor.getTaxaDesconto() != 0) {
                p.precoFinal = p.precoDeCusto - ((p.fornecedor.getTaxaDesconto() / p.precoDeCusto) * 100);
            } else {
                p.precoFinal = p.precoDeCusto;
            }
            p.id = padaria.produtosNaoPereciveis.size();
            padaria.produtosNaoPereciveis.add(p);
        }

    }

    /*public static Funcionario cadastrarFuncionario(Scanner leitor, Loja padaria) {
        System.out.println("Escolha o cargo: \n");
        System.out.println("1 - Gerente\n 2 - Vendedor\n 3 - Padeiro\n");
        int funcao = leitor.nextInt();
        switch (funcao) {
            case 1:
                Gerente g = new Gerente();
                System.out.println("Insira onome: ");
                g.setNome(leitor.nextLine());
                System.out.println("Endere�o: ");
                g.setEndereco(leitor.nextLine());
                System.out.println("CPF: ");
                g.setCpf(leitor.nextLine());
                System.out.println("Sal�rio: ");
                g.setSalarioBruto(leitor.nextFloat());
                g.id = padaria.gerentes.size();
                padaria.gerentes.add(g);
            case 2:
                Vendedor v = new Vendedor();
                System.out.println("Insira o nome: ");
                v.setNome(leitor.nextLine());
                System.out.println("Endere�o: ");
                v.setEndereco(leitor.nextLine());
                System.out.println("CPF: ");
                v.setCpf(leitor.nextLine());
                System.out.println("Sal�rio: ");
                v.setSalarioBruto(leitor.nextFloat());
                v.id = padaria.vendedores.size();
                padaria.vendedores.add(v);
            case 3:
                Padeiro p = new Padeiro();
                System.out.println("Insira o nome: ");
                p.setNome(leitor.nextLine());
                System.out.println("Endere�o: ");
                p.setEndereco(leitor.nextLine());
                System.out.println("CPF: ");
                p.setCpf(leitor.nextLine());
                System.out.println("Sal�rio: ");
                p.setSalarioBruto(leitor.nextFloat());
                p.id = padaria.padeiros.size();
                padaria.padeiros.add(p);
            default:
                break;
        }
        return null;

    }*/

    private static void calcularImpostos(Loja padaria) {
        Imposto imp = new Imposto();
        for (Funcionario f : padaria.funcionarios) {
            System.out.println("Funcionario: " + f.getNome() + " tem "
                    + imp.calcularImpostoFuncionarios(f) + " de imposto");
        }
        
        for (Venda v : padaria.vendas) {
            System.out.println("Vendedor: " + v.getVendedor().getNome() + " tem "
                    + imp.calcularImpostoVendas(v) + " de imposto sobre a venda");
        }
    }

    public static void baterMetaFuncionario(Loja padaria, Scanner leitor) {
        int idFuncionario = 0;
        listarFuncionarios(padaria);
        System.out.println("Digite o id do funcion�rio a registrar o batimento da meta");
        idFuncionario = leitor.nextInt();

    }

    private static void carregarMenuImposto(Scanner leitor, Loja padaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Fornecedor cadastrarFornecedor(Scanner leitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void listarFornecedores(Loja padaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
