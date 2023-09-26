
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
    
    
    protected String nombreRed;

    public Interes() {
    }

    public Interes(String usuario, String password, int tiempoConectado, int likes) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
        this.likes = likes;
        
        
        
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

  
   

    
    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", password=" + password + ", tiempoConectado=" + tiempoConectado + ", likes=" + likes + ", nombreRed=" + nombreRed + '}';
    }

    public void añadir(ArrayList Arraylist, Interes interes) {
        Arraylist.add(interes);
    }
    
    public abstract void Listar();
    
}
