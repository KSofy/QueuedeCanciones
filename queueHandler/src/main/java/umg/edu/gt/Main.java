package umg.edu.gt;

import umg.edu.gt.model.Song;
import umg.edu.gt.service.SpotifyPlayer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpotifyPlayer spotify = new SpotifyPlayer();

       
        spotify.agregarCancion(new Song("Butterfly", "Artist A", 5, 2)); // Normal
        spotify.agregarCancion(new Song("Cancion Vip", "Artist B", 7, 1));     // ALTA
        spotify.agregarCancion(new Song("La Chona", "Artist C", 6, 2));   // Normal

        spotify.iniciarReproduccion();
    }
}
