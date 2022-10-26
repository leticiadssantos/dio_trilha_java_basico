<<<<<<< HEAD
package edu.classesMetodos;



public class SmartTv {

    // ATRIBUTOS
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // MÉTODOS PUBLICOS QUE O USUÁRIO PODE INTERAGIR
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentado o volume []");

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume []");
    }

    public void subirDeCanal() {
        canal++;

    }

    public void diminuirCanal() {
        canal--;

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

=======
package edu.classesMetodos;



public class SmartTv {

    // ATRIBUTOS
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // MÉTODOS PUBLICOS QUE O USUÁRIO PODE INTERAGIR
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentado o volume []");

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume []");
    }

    public void subirDeCanal() {
        canal++;

    }

    public void diminuirCanal() {
        canal--;

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

>>>>>>> 76a6ffb213bba201b4e1a7fba1ec10dcb4f41ce5
}