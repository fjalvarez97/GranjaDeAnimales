/**
 * Representa pollos de una granja
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public class Pollo extends AnimalPosibleModificado implements Vacunar 
{
    private boolean modificado;
    /**
     * Constructor for objects of class Pollo
     */
    public Pollo(boolean modificado)
    {
        super(1, modificado);
        this.modificado = modificado;
    }
         
    /**
     *  Muestra el sonido caracteristico del animal
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Pio, pio");
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
        puntosDeVida += 10;
    }
}
