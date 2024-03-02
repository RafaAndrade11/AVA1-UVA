package br.com.randrade.demo;

import br.com.randrade.domain.Computador;

public class Demo {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador("NVIDIA", "HyperX", "ASUS", "128GB", "Preto");
        Computador computador4 = new Computador("AMD", "Balistika", "Gigabyte", "256GB", "Branco");

        computador1.setPlacaDeVideo("ASUS");
        computador1.setMarcaMemoriaRam("Corsair");
        computador1.setPlacaMae("MSI");
        computador1.setTamanhoHd("512GB");
        computador1.setCorGabinete("Azul");

        computador2.setPlacaDeVideo("Gigabyte");
        computador2.setMarcaMemoriaRam("Kingston");
        computador2.setPlacaMae("ASRock");
        computador2.setTamanhoHd("1TB");
        computador2.setCorGabinete("Rosa");

        imprimir(computador1, computador2, computador3, computador4);
       
    }

    private static void imprimir(Computador computador1, Computador computador2, Computador computador3, Computador computador4) {
        System.out.println("COMPUTADOR 1: ");
        System.out.println(computador1.toString());
        System.out.println("COMPUTADOR 2: ");
        System.out.println(computador2.toString());
        System.out.println("COMPUTADOR 3: ");
        System.out.println(computador3.toString());
        System.out.println("COMPUTADOR 4: ");
        System.out.println(computador4.toString());
    }
}
