import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String anoLancamento;
    private List<Musica> musicas = new ArrayList<>();


    public Album(){

    }

    public Album(String nome, String anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        this.musicas.add(musica);
    }
}
