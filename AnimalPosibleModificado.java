/**
 * Esta clase representa un animal que puede estar geneticamente modificado
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public abstract class AnimalPosibleModificado extends Animal
{
    private boolean modificado;
    /**
     * Constructor for objects of class AnimalPosibleModificado
     * @param peso el peso del animal
     * @param modificado si el animal esta o no modificado
     */
    public AnimalPosibleModificado(int peso, boolean modificado)
    {
        super(peso);
        this.modificado = modificado;
    }
    
     /**
     * Alimenta al animal, pudiendo disminuir sus puntos de vida
     * y aumentando su peso
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
