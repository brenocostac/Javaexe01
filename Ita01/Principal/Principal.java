package Ita01.Principal;

import Ita01.dominio.Paciente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente01 = new Paciente(1.71,58);
        Paciente paciente02 = new Paciente(1.75,110);
        Paciente paciente03 = new Paciente(1.93,87);

        double imc1 = paciente01.calcularIMC();
        double imc2 = paciente02.calcularIMC();
        double imc3 = paciente03.calcularIMC();

        System.out.println("Paciente 01 seu IMC é: ");
        System.out.printf( "%.2f", imc1);
        System.out.println();
        System.out.println("Paciente 01 seu diagnóstico:");
        System.out.println(paciente01.diagnostico());
        System.out.println("Paciente 02 seu IMC é: ");
        System.out.printf( "%.2f", imc2 );
        System.out.println();
        System.out.println("Paciente 02 seu diagnóstico: ");
        System.out.println(paciente02.diagnostico());
        System.out.println("Paciente 03 seu IMC é: ");
        System.out.printf( "%.2f", imc3 );
        System.out.println();
        System.out.println("Paciente 03 seu diagnóstico: ");
        System.out.println(paciente03.diagnostico());
    }
}
