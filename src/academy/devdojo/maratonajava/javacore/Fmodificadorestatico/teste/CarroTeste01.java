package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes-Benz",275 );
        Carro carro3 = new Carro("Audi",290);

        Carro.setVelocidadeLimite(180);
        carro1.imprimi();
        carro2.imprimi();
        carro3.imprimi();
   }
}
