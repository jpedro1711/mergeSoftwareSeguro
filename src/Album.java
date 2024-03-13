import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String dataLancamento;
    private List<Musica> musicas = new ArrayList<>();

    public Album(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public Album()
    {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }
}
