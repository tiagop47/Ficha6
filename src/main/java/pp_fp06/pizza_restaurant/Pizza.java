package pp_fp06.pizza_restaurant;
import java.time.LocalDate;
import pp_fp06.pizzarestaurant.enums.TamanhoPizza;

public class Pizza {
    private static int codigoPizzas = 500;
    private static final int MAX_INGREDIENTES = 5;
    private int codigoPizza;
    private String nomePizza;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private TamanhoPizza tamanhopizza;
    private String descriçaoPizza;
    private float preço;
    private int numIngredientes;
    private Ingrediente[] coleçaoIngredientes;

    public Pizza(String nomePizza, TamanhoPizza tamanhopizza, String descriçaoPizza, float preço, LocalDate dataInicio, LocalDate dataFim) {
        this.codigoPizza = codigoPizzas++;
        this.nomePizza = nomePizza;
        this.descriçaoPizza = descriçaoPizza;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tamanhopizza = tamanhopizza;
        this.preço = preço;
        this.coleçaoIngredientes = new Ingrediente[MAX_INGREDIENTES];
        this.numIngredientes = 0;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public int getCodigoPizza() {
        return codigoPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nome) {
        this.nomePizza = nome;
    }

    public String getDescriçaoPizza() {
        return descriçaoPizza;
    }

    public void setDescriçaoPizza(String descriçao) {
        this.descriçaoPizza = descriçao;
    }

    public TamanhoPizza getTamanhoPizza() {
        return tamanhopizza;
    }

    public void setTamanhoPizza(TamanhoPizza tamanhopizza) {
        this.tamanhopizza = tamanhopizza;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public Ingrediente[] getColeçaoIngredientes() {
        return coleçaoIngredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (numIngredientes < MAX_INGREDIENTES) {
            this.coleçaoIngredientes[numIngredientes++] = ingrediente;
        } else {
            System.out.println("Número máximo de ingredientes atingido.");
        }
    }

    public static String pizzaToString(TamanhoPizza tamanhopizza) {
        switch (tamanhopizza) {
            case PEQUENA:
                return "Pizza é pequena";
            case MEDIA:
                return "Pizza é média";
            case FAMILIAR:
                return "Pizza é familiar";
            default:
                throw new IllegalArgumentException("Tamanho pizza inválido.");
        }
    }

    public void printPizza() {
        System.out.println("Codigo Pizza: " + codigoPizza + " Nome: " + nomePizza);
        System.out.println("Descriçao Pizza: " + descriçaoPizza + " Tamanho: " + tamanhopizza);
        System.out.println("Preço: " + preço + " Qtd ingredientes: " + numIngredientes);

        for (int i = 0; i < numIngredientes; i++) {
            coleçaoIngredientes[i].printIngrediente();
        }
        System.out.println();
    }
}