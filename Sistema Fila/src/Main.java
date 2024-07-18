import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        FilaBanco filaBanco = new FilaBanco();

        // Adicionar pessoas à fila
        filaBanco.adicionarPessoa(new Pessoa("João", LocalTime.of(9, 30), 2));
        filaBanco.adicionarPessoa(new Pessoa("Maria", LocalTime.of(9, 45), 1));
        filaBanco.adicionarPessoa(new Pessoa("Pedro", LocalTime.of(10, 0), 0));
        filaBanco.adicionarPessoa(new Pessoa("Ana", LocalTime.of(10, 15), 1));
        filaBanco.adicionarPessoa(new Pessoa("Carlos", LocalTime.of(10, 30), 2));

        // Retirar pessoas da fila
        System.out.println("Ordem de atendimento:");
        Pessoa pessoa = filaBanco.retirarPessoa();
        while (pessoa != null) {
            System.out.println(pessoa.getNome());
            pessoa = filaBanco.retirarPessoa();
        }
    }
}