package umg.edu.gt.service;

import umg.edu.gt.data_structure.queue.manual.QueueLinked;
import umg.edu.gt.model.Song;

public class SpotifyPlayer {
  
    private QueueLinked<Song> altaPrioridad = new QueueLinked<>();
    private QueueLinked<Song> normalPrioridad = new QueueLinked<>();

    public void agregarCancion(Song cancion) {
        if (cancion.getPriority() == 1) {
            altaPrioridad.enqueue(cancion);
        } else {
            normalPrioridad.enqueue(cancion);
        }
    }

    public void iniciarReproduccion() throws InterruptedException {
        System.out.println("[LOG] Starting playlist...");

       //Primero se vacía la cola de alta prioridad
        while (!altaPrioridad.isEmpty()) {
            reproducir(altaPrioridad.dequeue());
        }

        // Luego la normal
        while (!normalPrioridad.isEmpty()) {
            reproducir(normalPrioridad.dequeue());
        }

        System.out.println("[LOG] Playlist finished.");
    }

    private void reproducir(Song cancion) throws InterruptedException {
        System.out.println("\n[LOG] Now playing: " + cancion.getTitle() + " - " + cancion.getArtist() + " (" + cancion.getDuration() + "s)");
        
        // Simulación segundo a segundo (Parte B)
        for (int i = 1; i <= cancion.getDuration(); i++) {
            Thread.sleep(1000); // Pausa de 1 segundo real
            
            // Parte D: Barra de progreso (Extra)
            String barra = generarBarra(i, cancion.getDuration());
            System.out.print("\r[LOG] Playing: " + cancion.getTitle() + " | " + barra + " " + i + "s / " + cancion.getDuration() + "s");
        }
        System.out.println("\n[LOG] Finished: " + cancion.getTitle());
    }

    private String generarBarra(int actual, int total) {
        int limite = 10;
        int progreso = (actual * limite) / total;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < limite; i++) {
            sb.append(i < progreso ? "#" : "-");
        }
        sb.append("]");
        return sb.toString();
    }
}