package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author  Dawitt Ralph
 * 
 */
public class PowerSupply extends InfraestruturaCisco{
    public PowerSupply(Infraestrutura infraestrutura){
        super(infraestrutura);
    }
    
    @Override
    public String getModules() {
        return "Power Supply";
    }

    @Override
    public double getValue() {
        return 500 + this.getInfraestrutura().getValue();
    }
    
}
