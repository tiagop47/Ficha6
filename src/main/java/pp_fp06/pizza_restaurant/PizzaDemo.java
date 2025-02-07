package pp_fp06.pizza_restaurant;

import java.time.LocalDate;
import pp_fp06.pizzarestaurant.enums.TamanhoPizza;
import pp_fp06.pizzarestaurant.enums.origemIngredientes;

public class PizzaDemo {
    public static void main(String[] args) {
        // Cria datas específicas
        LocalDate dataInicio = LocalDate.of(2023, 6, 1);
        LocalDate dataFim = LocalDate.of(2023, 9, 1);

        // Cria uma pizza com as datas
        Pizza pizza = new Pizza("Margherita", TamanhoPizza.FAMILIAR, "Tomate, Mozzarella, Manjericão", 8.50f, dataInicio, dataFim);

        // Cria ingredientes
        Ingrediente ingrediente1 = new Ingrediente("Tomate", origemIngredientes.VEGETAL, 20);
        Ingrediente ingrediente2 = new Ingrediente("Mozzarella", origemIngredientes.ANIMAL, 80);
        Ingrediente ingrediente3 = new Ingrediente("Manjericão", origemIngredientes.VEGETAL, 5);

        // Adiciona ingredientes à pizza
        pizza.addIngrediente(ingrediente1);
        pizza.addIngrediente(ingrediente2);
        pizza.addIngrediente(ingrediente3);
        System.out.println("Pizza 1");
        // Imprime os detalhes da pizza
        pizza.printPizza();
    }
}