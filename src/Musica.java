/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class Musica extends Interes implements interesable{
    
    private String tipoMusica;

    public Musica() {
    }

    public Musica(String usuario, String password, int tiempoConectado, int likes, String tipoMusica) {
        super(usuario, password, tiempoConectado, likes);
        this.tipoMusica = tipoMusica;
    }

    
    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }
    
  @Override
  public void Listar(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Genero musica: " + tipoMusica + " . minutos: " + tiempoConectado + ". Likes : " + likes);
    }

    @Override
    public void likes(int Tv, int Musica, int Red){
        if(Musica > Tv && Musica > Red){
            System.out.println("El tema musica es el con mas likes:");
            System.out.println("Likes: " + Musica);
        }
    }
    
    @Override
    public void tiempo(int Tv, int Musica, int Red){
        if(Musica > Tv && Musica > Red){
            System.out.println("El tema con mas minutos :");
            System.out.println("minutos: " + Musica);
        }
    }
    

    @Override
    public void registrarLike(int likes){
        this.likes += likes;
    }
    
    @Override
    public void tiempoConectado(int tiempoConectado){
        this.tiempoConectado += tiempoConectado;
    }

    @Override
    public String toString() {
        return "Musica{" + "usuario=" + usuario + ", tipoMusica=" + tipoMusica + ", likes=" + likes + ", minutos=" + tiempoConectado + '}';
    }
    
    
    
    
    
}
