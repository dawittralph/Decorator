package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public abstract class Infraestrutura {
    private String model;
    
    public abstract String getModules();
    
    public abstract double getValue();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
}
