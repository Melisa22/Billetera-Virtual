package ar.com.ada.billeteravirtual.excepciones;

import ar.com.ada.billeteravirtual.Persona;

/**
 * PersonaDNIExceptio
 */
public class PersonaDNIException extends PersonaInfoException {

    public PersonaDNIException(Persona p, String mensaje) {
        super(p, mensaje);
    }

}