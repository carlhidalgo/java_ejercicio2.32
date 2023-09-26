/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class VerTv extends Interes implements interesable{
    
    private String generoTv;
    
    public VerTv(String usuario, String password, int tiempoConectado, int likes, String nombreRed) {
        super(usuario, password, tiempoConectado, likes);
        this.generoTv = generoTv;
    }
     public String getGeneroTv() {
        return generoTv;
    }

    public void setGeneroTv(String generoTv) {
        this.generoTv = generoTv;
    }
    @Override
    public void Listar() {
        System.out.println("Usuario: " + usuario);
        System.out.println("genero tv: " + generoTv + " . Minutes spent: " + tiempoConectado + ". Likes : " + likes);
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
        if(Tv > Musica && Tv > Red){
            System.out.println("El tema con mas likes: tv");
            System.out.println("Likes: " + Tv);
        }
    }

    @Override
    public void tiempo(int Tv, int Musica, int Red) {
        if(Tv > Musica && Tv > Red){
            System.out.println("El tema con mas minutos: TV.");
            System.out.println("Minutos: " + Tv);
        }
    }
   
    @Override
    public String toString() {
        return "Tv{" + "usuario=" + usuario + ", generoTv=" + generoTv + ", likes=" + likes + ", minutos=" + tiempoConectado + '}';
    }
    
    
}
