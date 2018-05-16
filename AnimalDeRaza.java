/**
 * Animales con calidad de su raza
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public abstract class AnimalDeRaza extends Animal
{
    private int calidadRaza;
    /**
     * Constructor for objects of class AnimalesDeRaza
     * @param peso el peso del animal
     * @param valorRaza la calidad de la raza del animal
     */
    public AnimalDeRaza(int peso, int calidadRaza)
    {
        super(peso);
        this.calidadRaza = calidadRaza;
    }

    /**
     * Alimenta al animal, disminuyendo sus puntos de vida
     * y aumentando su peso
     */
    @Override
    public  void comer()
    {
        peso += 2;
        if (calidadRaza >= 5){
            puntosDeVida -= (10 - calidadRaza);
        }
        else {
            puntosDeVida -= 10;
        }
    }
}