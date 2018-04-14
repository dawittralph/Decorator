package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class Minigibic extends InfraestruturaCisco{
    public Minigibic(Infraestrutura infraestrutura){
        super(infraestrutura);
    }

    @Override
    public String getModules() {
        return "Minigibic";
    }

    @Override
    public double getValue() {
        return 243 + this.getInfraestrutura().getValue();
    }
}
