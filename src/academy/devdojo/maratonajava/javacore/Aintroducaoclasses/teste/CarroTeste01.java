package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "GM";
        carro1.nome = "Corsa";
        carro1.ano = 2002;

        carro2.modelo = "Jeep";
        carro2.nome = "Compass";
        carro2.ano = 2024;
        System.out.println(carro1.modelo+" "+carro1.nome+" "+carro1.ano);
        System.out.println(carro2.modelo+" "+carro2.nome+" "+carro2.ano);
        System.out.println("--------------------------------");
        carro1 = carro2;

        System.out.println(carro1.modelo+" "+carro1.nome+" "+carro1.ano);
        System.out.println(carro2.modelo+" "+carro2.nome+" "+carro2.ano);


    }
}
