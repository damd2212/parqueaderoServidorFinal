/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopservidor.negocio;

/**
 *
 * @author danny
 */
public class Parqueadero {
    private String nitParqueadero;
    private String nomParqueadero;
    private String direcParqueadero;
    private String telParqueadero;
    private String usuarioPar;
    
    //Constructor parametrizado de la clase parqueadero
    public Parqueadero(String nitParqueadero, String nomParqueadero, String direcParqueadero, String telParqueadero, String usuarioAdmin) {
        this.nitParqueadero = nitParqueadero;
        this.nomParqueadero = nomParqueadero;
        this.direcParqueadero = direcParqueadero;
        this.telParqueadero = telParqueadero;
        this.usuarioPar = usuarioAdmin;
    }
    //Constructor sin parametros de la clase parqueadero
    public Parqueadero(){
        nitParqueadero = "";
        nomParqueadero= "";
        direcParqueadero= "";
        telParqueadero= "";
        usuarioPar= "";
    }
    
    /**
     * Getters y Setters para los atributos de la clase Parqueadero
     */
    public String getNitParqueadero() {
        return nitParqueadero;
    }

    public void setNitParqueadero(String nitParqueadero) {
        this.nitParqueadero = nitParqueadero;
    }

    public String getNomParqueadero() {
        return nomParqueadero;
    }

    public void setNomParqueadero(String nomParqueadero) {
        this.nomParqueadero = nomParqueadero;
    }

    public String getDirecParqueadero() {
        return direcParqueadero;
    }

    public void setDirecParqueadero(String direcParqueadero) {
        this.direcParqueadero = direcParqueadero;
    }

    public String getTelParqueadero() {
        return telParqueadero;
    }

    public void setTelParqueadero(String telParqueadero) {
        this.telParqueadero = telParqueadero;
    }

    public String getUsuarioPar() {
        return usuarioPar;
    }

    public void setUsuarioPar(String usuarioPar) {
        this.usuarioPar = usuarioPar;
    }
    
    
}
