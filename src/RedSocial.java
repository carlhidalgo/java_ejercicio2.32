/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class RedSocial extends Interes implements interesable {
    
    private String nombreRed;
    
    public RedSocial() {
    }

    public RedSocial(String usuario, String password, int tiempoConectado, int likes, String nombreRed) {
        super(usuario, password, tiempoConectado, likes);
        this.nombreRed = nombreRed;
    }
        public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    @Override
    public void Listar() {
        System.out.println("Usuario: " + usuario);
        System.out.println("red social: " + nombreRed + " . Minutos: " + tiempoConectado + ". Likes : " + likes);
    }

    @Override
    public void registrarLike(int cantidad) {
        this.likes += likes;
    }

    @Override
    public void tiempoConectado(int cantidad) {
        this.tiempoConectado += tiempoConectado;
    }

    @Override
    public void likes(int Tv, int Musica, int Red) {
            if(Red > Musica && Red > Tv){
            System.out.println("El tema con mas likes: red social.");
            System.out.println("Likes: " + Red);
        }       
    }

    @Override
    public void tiempo(int Tv, int Musica, int Red) {
        if(Red > Musica && Red > Tv){
            System.out.println("El tema con mas minutos: red social.");
            System.out.println("Minutos: " + Red);
        }
    }
    
    @Override
    public String toString() {
        return "Red social{" + "usuario=" + usuario + ", nombreRed=" + nombreRed + ", likes=" + likes + ", minutes=" + tiempoConectado + '}';
    }
    
}
