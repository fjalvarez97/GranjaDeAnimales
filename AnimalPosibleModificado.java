
/**
 * Write a description of class AnimalPosibleModificado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class AnimalPosibleModificado extends Animal
{
    private boolean modificado;
    /**
     * Constructor for objects of class AnimalPosibleModificado
     */
    public AnimalPosibleModificado(int peso, boolean modificado)
    {
        super(peso);
        this.modificado = modificado;
    }
    
     /**
     * Alimenta al animal, disminuyendo sus puntos de vida
     */
    @Override
    public  void comer()
    {
        boolean pierdeVida = true;
        peso += 1;
        if (modificado){
             int random= (int) (Math.random() * 100 + 1);
             if (random >50){
                 pierdeVida = false;
             }
        }
        if (pierdeVida){
            puntosDeVida -= 10;
        }
    }
}
