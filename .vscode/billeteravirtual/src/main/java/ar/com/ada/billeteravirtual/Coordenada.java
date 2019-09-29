package ar.com.ada.billeteravirtual;

/**
 * Coordenadas
 */
public class Coordenada {

   float longitud;
   float latitud;

   public Coordenada(float latitud, float longitud) {
      this.latitud = latitud;
      this.longitud = longitud;
  }

  public Coordenada() {
  }

  public float getLatitud() {
      return latitud;
  }

  public void setLatitud(float latitud) {
      this.latitud = latitud;
  }

  public float getLongitud() {
      return longitud;
  }

  public void setLongitud(float longitud) {
      this.longitud = longitud;
  }
  
}