package pp_fp06.pizza_restaurant;

import java.time.LocalDate;
import java.util.Scanner;

import pp_fp06.pizzarestaurant.enums.TamanhoPizza;
import pp_fp06.pizzarestaurant.enums.origemIngredientes;

public class PizzaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria datas específicas
        LocalDate dataInicioPizza = LocalDate.of(2023, 6, 1);
        LocalDate dataFimPizza = LocalDate.of(2023, 9, 1);

        LocalDate dataInicioEmenta = LocalDate.of(2023, 10, 21);
        LocalDate dataFimEmenta = LocalDate.of(2023, 12, 20);

        LocalDate dataEmentaInicio2 = LocalDate.of(2023, 10, 21);
        LocalDate dataFimEmenta2 = LocalDate.of(2023, 12, 21);
        

        // Cria uma pizza com as datas
        Pizza pizza = new Pizza("Vegan", TamanhoPizza.FAMILIAR, "4 estaçoes", 8.50f, dataInicioPizza, dataFimPizza);
        
        // Cria ingredientes
        Ingrediente ingrediente1 = new Ingrediente("Tomate", origemIngredientes.VEGETAL, 20);
        Ingrediente ingrediente2 = new Ingrediente("Mozzarella", origemIngredientes.ANIMAL, 80);
        Ingrediente ingrediente3 = new Ingrediente("Manjericão", origemIngredientes.VEGETAL, 5);

        Ementa minhEmenta = new Ementa("Primeira Ementa","Fim de Semana", dataInicioEmenta, dataFimEmenta );
        Ementa ementaDois = new Ementa("segunda ementa", "Verao", dataEmentaInicio2, dataFimEmenta2);

        // Adiciona ingredientes à pizza
        pizza.addIngrediente(ingrediente1);
        pizza.addIngrediente(ingrediente2);
        pizza.addIngrediente(ingrediente3);
        //adiciona a pizza à ementa
        minhEmenta.addPizza(pizza);
        
        Ementa.setEmentaAtiva(ementaDois);
        // Imprime os detalhes da pizza
        boolean escolherOpçao = false;

     do{
        System.out.println("Escolha uma opção: ");
        System.out.println("Ver pizzas: [1]");
        System.out.println("Ver Ingredientes: [2]");
        System.out.println("Ver Ementa disponivel: [3]");
        System.out.println("Sair [0]");
        int opçao = scanner.nextInt();
        switch (opçao ) {
            case 0:
            System.out.println("Volte Sempre =)");
            escolherOpçao = true;
            break;
            case 1: 
            minhEmenta.printAllPizzas();
            break;
            case 2:
            minhEmenta.printAllIngredientesPizzas();
            break;
            case 3:
            Ementa.getEmentaAtiva().printEmenta();
            break;
            default: 
            throw new IllegalArgumentException("Escolha Inválida");
            }
        }while(!escolherOpçao);
        scanner.close();
        }
        
    }