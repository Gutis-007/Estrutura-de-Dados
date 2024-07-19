import java.time.LocalTime;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private LocalTime horarioChegada;
    private int nivelPrioridade;

    public Pessoa(String nome, LocalTime horarioChegada, int nivelPrioridade) {
        this.nome = nome;
        this.horarioChegada = horarioChegada;
        this.nivelPrioridade = nivelPrioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(LocalTime horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public int getNivelPrioridade() {
        return nivelPrioridade;
    }

    public void setNivelPrioridade(int nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        int prioridadeComparison = Integer.compare(outraPessoa.nivelPrioridade, this.nivelPrioridade);
        if (prioridadeComparison != 0) {
            return prioridadeComparison;
        } else {
            return this.horarioChegada.compareTo(outraPessoa.horarioChegada);
        }
    }
}