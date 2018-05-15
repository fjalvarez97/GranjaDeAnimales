/**
 * Representa cerdos de una granja
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public class Cerdo extends Animal implements Vacunar
{
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        super(15);
    }

    /**
     * Alimenta al animal, disminuyendo sus puntos de vida
     */
    @Override
    public  void comer()
    {
        peso += 2;
        puntosDeVida -= 10;
    }

    /**
     *  Muestra el sonido caracteristico del animal
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Ñoinq, ñoinq");
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
        puntosDeVida += 20;
    }
}
