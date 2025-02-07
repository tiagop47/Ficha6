package pp_fp06.pizza_restaurant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ementa {
    private static  int nextID=0;
    private int codigo;
    private String designaçao;
    private String descriçao;
    private int numPizzasPertence;
    private int numPizzasNaoPertence;
    LocalDate dataInicio;
    LocalDate dataFim;

    private List<Pizza> pizzas;

    public Ementa(String designaçao, String descriçao,int numPizzasNaoPertence,LocalDate dataInicio,LocalDate dataFim,int numPizzasPertence){
        this.codigo = nextID++;
        this.designaçao = designaçao;
        this.descriçao = descriçao; 
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.numPizzasPertence = numPizzasPertence;
        this.numPizzasNaoPertence = numPizzasNaoPertence;
        this.pizzas = new ArrayList<>();
    }
    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
        if(isPizzaInEmenta(pizza)){
        }
    }
    public boolean isPizzaInEmenta(Pizza pizza){
        LocalDate pizzaInicio = pizza.getDataInicio();
        LocalDate pizzaFim = pizza.getDataFim();
        return (pizzaInicio.isAfter(dataInicio)|| pizzaInicio.isEqual(dataFim));
    }
    public void printEmenta(){
        System.out.println("Codigo ementa: "+codigo+"\tDescriçao: "+descriçao);
        System.out.println("data inicio: "+dataInicio+"DATA fim emennta: "+dataFim);
        System.out.println("Numero pizzas EMENTA: "+numPizzasPertence+"Num pizzas NAO PERTENCE: "+numPizzasNaoPertence);
    }

}