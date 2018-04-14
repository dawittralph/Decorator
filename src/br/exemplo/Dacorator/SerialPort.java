package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class SerialPort extends InfraestruturaCisco{
    public SerialPort(Infraestrutura infraestrutura){
        super(infraestrutura);
    }

    @Override
    public String getModules() {
        return "Serial Ports";
    }

    @Override
    public double getValue() {
        return 170 + this.getInfraestrutura().getValue();
    }
}
