//package tarea2;

/**
 * Nombre del Programa: Marcador Baloncesto
 * Descripcion: Programa que calcula el ganador del Partido y cada uno de sus cuartos, basado en los datos ingresados por el usuario.
 * Autor: Kimberly Cascante Mora
 * Fecha de Creacion: 04/06/2020
 * Modificado por: Kimberly
 * Fecha de Modificacion: 04/06/2020
 */
import java.io.*;
public class ejer {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    public static void main(final String[] args) throws IOException {
        int teamA, teamB;
        int teamA1, teamA2, teamA3, teamA4, teamB1, teamB2, teamB3, teamB4;
        out.println("Digite la cantidad de puntos anotados por el equipo A en el primer cuarto");
        teamA1 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo A en el segundo cuarto");
        teamA2 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo A en el tercer cuarto");
        teamA3 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo A en el cuarto cuarto");
        teamA4 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo B en el primer cuarto");
        teamB1 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo B en el segundo cuarto");
        teamB2 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo B en el tercer cuarto");
        teamB3 = Integer.parseInt(in.readLine());
        out.println("Digite la cantidad de puntos anotados por el equipo B en el cuarto cuarto");
        teamB4 = Integer.parseInt(in.readLine());
        teamA = teamA1 + teamA2 + teamA3 + teamA4;
        teamB = teamB1 + teamB2 + teamB3 + teamB4;
        out.println("El equipo A termino con un marcador total de " + teamA
                + " Puntos, mientas que el equipo B termino con un marcador total de " + teamB + " Puntos");
        if (teamA1 == teamB1) {
            out.println("Hubo empate de marcador en el primer cuarto");
        } else if (teamA1 > teamB1) {
            out.println("El equipo A gano el primer cuarto");
        } else {
            out.println("El equipo B gano el primer cuarto");
        }
        if (teamA2 == teamB2) {
            out.println("Hubo empate de marcador en el segundo cuarto");
        } else if (teamA2 > teamB2) {
            out.println("El equipo A gano el segundo cuarto");
        } else {
            out.println("El equipo B gano el segundo cuarto");
        }
        if (teamA3 == teamB3) {
            out.println("Hubo empate de marcador en el tercer cuarto");
        } else if (teamA3 > teamB3) {
            out.println("El equipo A gano el tercer cuarto");
        } else {
            out.println("El equipo B gano el tercer cuarto");
        }
        if (teamA4 == teamB4) {
            out.println("Hubo empate de marcador en el cuarto cuarto");
        } else if (teamA4 > teamB4) {
            out.println("El equipo A gano el cuarto cuarto");
        } else {
            out.println("El equipo B gano el cuarto cuarto");
        }
        if (teamA == teamB) {
            out.println("Hubo empate en el marcador total del partido");
        } else if (teamA > teamB) {
            out.println("El ganador del partico de Baloncesto es el equipo A");
        } else {
            out.println("El ganador del partico de Baloncesto es el equipo B");
        }
    }
}