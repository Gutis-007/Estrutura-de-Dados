import java.util.PriorityQueue;

public class FilaBanco {
    private PriorityQueue<Pessoa> filaPrioridade1;
    private PriorityQueue<Pessoa> filaPrioridade2;
    private PriorityQueue<Pessoa> filaNormal;

    public FilaBanco() {
        filaPrioridade1 = new PriorityQueue<>();
        filaPrioridade2 = new PriorityQueue<>();
        filaNormal = new PriorityQueue<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        switch (pessoa.getNivelPrioridade()) {
            case 2:
                filaPrioridade2.offer(pessoa);
                break;
            case 1:
                filaPrioridade1.offer(pessoa);
                break;
            default:
                filaNormal.offer(pessoa);
                break;
        }
    }

    public Pessoa retirarPessoa() {
        if (!filaPrioridade2.isEmpty()) {
            return filaPrioridade2.poll();
        } else if (!filaPrioridade1.isEmpty()) {
            return filaPrioridade1.poll();
        } else if (!filaNormal.isEmpty()) {
            return filaNormal.poll();
        } else {
            return null;
        }
    }
}