import java.util.ArrayList;
/**
 * Esta clase representa una granja de animales
 *
 * @author Fran Alvarez
 * @version 1.0
 */
public class Granja
{
    /**
     * Metodo para alimentar a un animal
     * @param animal el animal a alimentar
     */
    public void alimentar(Animal animal)
    {      
        animal.comer();
    }
    
    /**
     * Metodo para vacunar a un animal
     * @param animal el animal a vacunar
     */
    public void vacunar(Vacunar animal)
    {      
        animal.vacunar();
    }
    
    /**
     * Metodo para emitir el sonido caracteristico de un animal
     * @param animal el animal del cual emitir su sonido caracteristico
     */
    public void hacerEmitirSonidoCaracterístico(Animal animal)
    {      
        animal.emitirSonidoCaracteristico();
    }
}
