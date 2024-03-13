import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do albúm: ");
        String nomeAlbum = sc.nextLine();

        System.out.println("Digite o data de lançamento do albúm (dd/mm/yyyy): ");
        String dataLancamento = sc.nextLine();

        Album album = new Album(nomeAlbum, dataLancamento);

        int counter = 0;

        System.out.println("Digite o total de músicas do albúm: ");
        int musicas = sc.nextInt();

        while (musicas < 5)
        {
            System.out.println("O número mínimo de músicas é 5");
            musicas = sc.nextInt();
        }

        sc.nextLine();

        for (int i = 0; i < musicas; i++)
        {
            System.out.println("Digite o nome da música: ");
            String nomeMusica = sc.nextLine();

            Musica m = new Musica(nomeMusica);

            album.addMusica(m);
        }


        System.out.println("album: " + album.getNome());
        System.out.println("data de lançamento: " + album.getDataLancamento());

        for (int j = 0; j < album.getMusicas().size(); j++)
        {
            System.out.println(" - " + album.getMusicas().get(j).getNome());
        }


        sc.close();
    }
}