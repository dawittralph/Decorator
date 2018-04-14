package br.exemplo.Dacorator;

/**
 *
 * @author Antônio Francisco
 * @author Dawitt Ralph
 */
public class DecoratorExample {
    
    public static void main(String[] args) {
        Infraestrutura infraestrutura = new Router3945E();
        returnInformations(infraestrutura);
        ////Caso deseje inserir um módulo de Minigibic basta usar o comando abaixo;
        //infraestrutura = new Minigibic(infraestrutura);
        //Caso deseje inserir um módulo de Portas Seriais basta usar o comando abaixo;
        //infraestrutura = new SerialPort(infraestrutura);
        //Caso deseje inserir um módulo de Fonte de Alimentação basta usar o comando abaixo;
        infraestrutura = new PowerSupply(infraestrutura);
        returnInformations(infraestrutura);
    }
    
    public static void returnInformations(Infraestrutura infraestrutura){
        System.out.println(infraestrutura.getModel() + " + " +
                infraestrutura.getModules() + " - Preço Total: R$" +
                infraestrutura.getValue());
    }
    
}
