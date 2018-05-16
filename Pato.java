/**
 * Representa patos de una granja
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public class Pato extends AnimalPosibleModificado
{
    private boolean modificado;
    /**
     * Constructor for objects of class Cerdo
     */
    public Pato(boolean modificado)
    {
        super(2, modificado);
        this.modificado = modificado;
    }
    
    /**
     *  Muestra el sonido caracteristico del animal
     */
    @Override
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Cua, cua");
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
}
