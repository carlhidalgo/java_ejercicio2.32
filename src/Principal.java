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
        Musica usuario1 = new Musica("alessia", "cucaracha", 120, 50, "Rock");
        Musica usuario2 = new Musica("tomas", "admin", 180, 75, "Pop");
        VerTv usuario3 = new VerTv("jennifer", "hormiga", 240, 60, "Comedia");
        VerTv usuario4 = new VerTv("lorena", "abeja23", 150, 45, "Drama");
        RedSocial usuario5 = new RedSocial("ignacia", "serpiente09", 300, 80, "Facebook");
        RedSocial usuario6 = new RedSocial("valeria", "oveja", 210, 70,  "Instagram");

        // Agregar objetos a la lista de intereses
        intereses.add(usuario1);
        intereses.add(usuario2);
        intereses.add(usuario3);
        intereses.add(usuario4);
        intereses.add(usuario5);
        intereses.add(usuario6);

        // Contadores para likes y tiempo de cada tipo de interés
        int countLikesTv = 0, countMinutesTv = 0;
        int countLikesRed = 0, countMinutesRed = 0;
        int countLikesMusica = 0, countMinutesMusica = 0;

        // Calcular y mostrar el interés con más likes y tiempo
        for (Interes interes : intereses) {
            interes.Listar();

            // Actualizar los contadores según el tipo de interés
            if (interes instanceof Musica) {
                countLikesMusica += interes.getLikes();
                countMinutesMusica += interes.getTiempoConectado();
            } else if (interes instanceof VerTv) {
                countLikesTv += interes.getLikes();
                countMinutesTv += interes.getTiempoConectado();
            } else if (interes instanceof RedSocial) {
                countLikesRed += interes.getLikes();
                countMinutesRed += interes.getTiempoConectado();
            }

            System.out.println("---");
        }

        // Encontrar el tipo con más likes y tiempo
        String tipoConMasLikes = "";
        int maxLikes = 0;

        if (countLikesMusica > maxLikes) {
            maxLikes = countLikesMusica;
            tipoConMasLikes = "Música";
        }

        if (countLikesTv > maxLikes) {
            maxLikes = countLikesTv;
            tipoConMasLikes = "TV";
        }

        if (countLikesRed > maxLikes) {
            maxLikes = countLikesRed;
            tipoConMasLikes = "Redes Sociales";
        }

        System.out.println("El tipo con mas likes es: " + tipoConMasLikes);

        String tipoConMasTiempo = "";
        int maxTiempo = 0;

        if (countMinutesMusica > maxTiempo) {
            maxTiempo = countMinutesMusica;
            tipoConMasTiempo = "Música";
        }

        if (countMinutesTv > maxTiempo) {
            maxTiempo = countMinutesTv;
            tipoConMasTiempo = "TV";
        }

        if (countMinutesRed > maxTiempo) {
            maxTiempo = countMinutesRed;
            tipoConMasTiempo = "Redes Sociales";
        }

        System.out.println("El tipo con mas tiempo conectado es: " + tipoConMasTiempo);
    }
}