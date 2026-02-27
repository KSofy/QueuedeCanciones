package umg.edu.gt.data_structure.queue;

import umg.edu.gt.data_structure.queue.manual.QueueLinked;

public class Main {
    
    public static void main(String[] args) {
        // Probando la cola genérica con Strings
        QueueLinked<String> queue = new QueueLinked<>();
        queue.enqueue("Canción A");
        queue.enqueue("Canción B");
        queue.enqueue("Canción C");

        System.out.println("Peek: " + queue.peek());      // Canción A
        System.out.println("Dequeue: " + queue.dequeue()); // Canción A
        System.out.println("Dequeue: " + queue.dequeue()); // Canción B
        System.out.println("Tamaño: " + queue.size());     // 1
    }
}