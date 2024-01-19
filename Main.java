/*
// Universidad Politecnica de Tlaxcala - TI
// Fundamentos de POO
// Practica
// Objetivo: Programa para llevar el registro de un coche, los datos de mantenimiento y consumo de gasolina
// Sergio Jesús Sánchez Ahuactzin
 */
import Mantenimiento.Carro;
import Mantenimiento.Carro2;
import Mantenimiento.Carro3;

public class Main {
    public static void main(String[] args) {
        //Documentar
        Carro carro = new Carro();
        //Documentar
        carro.setMarca("Chervolet");
        System.out.println(carro.getMarca());

        carro.setModelo("\nCamaro");
        System.out.println(carro.getModelo());

        carro.setColor("\nRojo");
        System.out.println((carro.getColor()));

        Carro2 carro2 = new Carro2();
        //Documentar
        carro.setMarca("\nToyota");
        System.out.println(carro.getMarca());

        carro.setModelo("\nCorolla");
        System.out.println(carro.getModelo());

        carro.setColor("\nGris");
        System.out.println((carro.getColor()));

        Carro3 carro3 = new Carro3();
        //Documentar
        carro.setMarca("\nChevrolet");
        System.out.println(carro.getMarca());

        carro3.setModelo("\nAveo");
        System.out.println(carro3.getModelo());

        carro3.setColor("\nNegro");
        System.out.println((carro3.getColor()));
    }
}