/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author carlos
 */


public class Principal {
    public static void main(String[] args) {
        ArrayList<Interes> intereses = new ArrayList<>();

        // Crear objetos de las clases
        Musica usuario1 = new Musica("Usuario1", "Password1", 120, 50, "Rock", "N/A", "N/A");
        Musica usuario2 = new Musica("Usuario2", "Password2", 180, 75, "Pop", "N/A", "N/A");
        VerTv usuario3 = new VerTv("Usuario3", "Password3", 240, 60, "N/A", "Comedia", "N/A");
        VerTv usuario4 = new VerTv("Usuario4", "Password4", 150, 45, "N/A", "Drama", "N/A");
        RedSocial usuario5 = new RedSocial("Usuario5", "Password5", 300, 80, "N/A", "N/A", "Facebook");
        RedSocial usuario6 = new RedSocial("Usuario6", "Password6", 210, 70, "N/A", "N/A", "Instagram");

        // Agregar objetos a la lista de intereses
        intereses.add(usuario1);
        intereses.add(usuario2);
        intereses.add(usuario3);
        intereses.add(usuario4);
        intereses.add(usuario5);
        intereses.add(usuario6);

        // Contadores para likes y tiempo de cada tipo de interés
        int ctrLikesTv = 0, ctrMinutesTv = 0;
        int ctrLikesRed = 0, ctrMinutesRed = 0;
        int ctrLikesMusica = 0, ctrMinutesMusica = 0;

        // Calcular y mostrar el interés con más likes y tiempo
        for (Interes interes : intereses) {
            interes.Listar();

            // Actualizar los contadores según el tipo de interés
            if (interes instanceof Musica) {
                ctrLikesMusica += interes.getLikes();
                ctrMinutesMusica += interes.getTiempoConectado();
            } else if (interes instanceof VerTv) {
                ctrLikesTv += interes.getLikes();
                ctrMinutesTv += interes.getTiempoConectado();
            } else if (interes instanceof RedSocial) {
                ctrLikesRed += interes.getLikes();
                ctrMinutesRed += interes.getTiempoConectado();
            }

            System.out.println("---");
        }

        // Encontrar el tipo con más likes y tiempo
        String tipoConMasLikes = "";
        int maxLikes = 0;

        if (ctrLikesMusica > maxLikes) {
            maxLikes = ctrLikesMusica;
            tipoConMasLikes = "Música";
        }

        if (ctrLikesTv > maxLikes) {
            maxLikes = ctrLikesTv;
            tipoConMasLikes = "TV";
        }

        if (ctrLikesRed > maxLikes) {
            maxLikes = ctrLikesRed;
            tipoConMasLikes = "Redes Sociales";
        }

        System.out.println("El tema con mas likes es: " + tipoConMasLikes);

        String tipoConMasTiempo = "";
        int maxTiempo = 0;

        if (ctrMinutesMusica > maxTiempo) {
            maxTiempo = ctrMinutesMusica;
            tipoConMasTiempo = "Música";
        }

        if (ctrMinutesTv > maxTiempo) {
            maxTiempo = ctrMinutesTv;
            tipoConMasTiempo = "TV";
        }

        if (ctrMinutesRed > maxTiempo) {
            maxTiempo = ctrMinutesRed;
            tipoConMasTiempo = "Redes Sociales";
        }

        System.out.println("El tema con mas tiempo conectado es: " + tipoConMasTiempo);
    }
}