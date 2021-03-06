package org.compi2.codigo3d.parser;

/*
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String verdadero;
    private String falso;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    public NodoC3D(String cad,String verdadero,String falso) {
        this.cad = cad;
        this.verdadero= verdadero;
        this.falso = falso;
    }
    
    public String getCad(){
        return cad;
    }

    public String getVerdadero() {
        return verdadero;
    }

    public String getFalso() {
        return falso;
    }
    
        
}
