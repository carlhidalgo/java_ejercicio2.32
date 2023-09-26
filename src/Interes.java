
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public abstract class Interes {
    
    protected String usuario;
    protected String password;
    protected int tiempoConectado;
    protected int likes;
    protected String tipoMusica;
    protected String generoTv;
    protected String nombreRed;

    public Interes() {
    }

    public Interes(String usuario, String password, int tiempoConectado, int likes, String tipoMusica, String generoTv, String nombreRed) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
        this.likes = likes;
        this.tipoMusica = tipoMusica;
        this.generoTv = generoTv;
        this.nombreRed = nombreRed;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public String getGeneroTv() {
        return generoTv;
    }

    public void setGeneroTv(String generoTv) {
        this.generoTv = generoTv;
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", password=" + password + ", tiempoConectado=" + tiempoConectado + ", likes=" + likes + ", tipoMusica=" + tipoMusica + ", generoTv=" + generoTv + ", nombreRed=" + nombreRed + '}';
    }

    public void añadir(ArrayList Arraylist, Interes interes) {
        Arraylist.add(interes);
    }
    
    public abstract void Listar();
    
}
