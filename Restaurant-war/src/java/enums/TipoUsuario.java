/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author gabri
 */
public enum TipoUsuario {
    ADMIN("admin"),
    GARCOM("garcom");

    private final String value;

    private TipoUsuario(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }  
}
