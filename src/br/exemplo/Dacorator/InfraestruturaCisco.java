package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public abstract class InfraestruturaCisco extends Infraestrutura{
    private Infraestrutura infraestrutura;
    
    public InfraestruturaCisco(Infraestrutura infraestrutura){
        this.infraestrutura = infraestrutura;
        this.setModel(infraestrutura.getModel());
    }

    public Infraestrutura getInfraestrutura() {
        return infraestrutura;
    }
    
    
    
}
