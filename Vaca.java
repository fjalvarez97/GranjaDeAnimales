/**
 * Representa vacas de una granja
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public class Vaca extends AnimalDeRaza implements Vacunar
{
    /**
     * Constructor de objetos de la clase Vaca
     * @param calidadRaza la calidad de la raza del animal (0-10)
     */
    public Vaca(int calidadRaza)
    {
        super(15, calidadRaza);
    }
    
    /**
     *  Muestra el sonido caracteristico del animal
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Muuuu, muuuu");
    }

    /**
     * Devuelve el peso del animal
     * @return el peso del animal
     */
    @Override
    public int getPeso()
    {
        return peso;
    }

    /**
     * Devuelve los puntos de vida del animal
     * @return los puntos de vida del animal
     */
    @Override
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Vacuna al animal aumentando sus puntos de vida
     */
    public void vacunar()
    {
        puntosDeVida += 30;
    }
}
