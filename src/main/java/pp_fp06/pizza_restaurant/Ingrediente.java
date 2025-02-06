package pp_fp06.pizza_restaurant;
import pp_fp06.pizzarestaurant.enums.origemIngredientes;

public class Ingrediente {
    private static  int codigoIngrediente= 1000;
    private int codigo;
    String nome;
    private origemIngredientes origem;
    private int numKcal;

    public Ingrediente(String nome, origemIngredientes origem,int numKcal){
        this.codigo = codigoIngrediente++;
        this.nome = nome;
        this.origem = origem;
        this.numKcal = numKcal;
    }

}
