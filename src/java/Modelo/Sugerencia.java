/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Swift
 */
public class Sugerencia {
      private int idsugerencia;
      private String descripcion;
      private int idpersona;
      private int idarea;
      private int idrol;
      private String estado;

    public Sugerencia() {
    }

    public Sugerencia(int idsugerencia, String descripcion, int idpersona, int idarea, int idrol, String estado) {
        this.idsugerencia = idsugerencia;
        this.descripcion = descripcion;
        this.idpersona = idpersona;
        this.idarea = idarea;
        this.idrol = idrol;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
      
      
      
      
    
}
