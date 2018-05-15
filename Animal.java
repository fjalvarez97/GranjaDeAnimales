
/**
 * Esta clase representa animales
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public abstract class Animal
{
    private int puntosDeVida;
    /**
     * Constructor de objetos de la clase Animal
     */
    public Animal()
    {
        puntosDeVida = 100;
    }

    /**
     * Alimenta al animal, disminuyendo sus puntos de vida
     */
    public abstract void comer();
    
    /**
     *  Muestra el sonido caracteristico del animal
     */
    public abstract void emitirSonidoCaracteristico();
    
    /**
     * Devuelve el peso del animal
     * @return el peso del animal
     */
    public abstract int getPeso();
 
    /**
     * Devuelve los puntos de vida del animal
     * @return los puntos de vida del animal
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
}
