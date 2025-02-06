package pp_fp06.pizza_restaurant;
import pp_fp06.pizzarestaurant.enums.TamanhoPizza;

public class Pizza {
    private static  int codigoPizzas=500;
    private static final int MAX_INGREDIENTES = 5;
    private int codigoPizza;
    private String nomePizza;
    private TamanhoPizza tamanhopizza;
    private String descriçaoPizza;
    private float  preço;
    private int numIngredientes;
    private int[] coleçaoIngredientes = new int[MAX_INGREDIENTES];

    public Pizza(String nomePizza,TamanhoPizza tamanhopizza,String descriçaoPizza,float preço,int numIngredientes,int[] coleçaoIngredientes){
        this.codigoPizza = codigoPizzas++;
        this.nomePizza = nomePizza;
        this.descriçaoPizza = descriçaoPizza;
        this.tamanhopizza = tamanhopizza;
        this.preço = preço;
        this.numIngredientes = numIngredientes;
        this.coleçaoIngredientes = coleçaoIngredientes;
    }

    public int getCodigoPizza(){
        return codigoPizza;
    }
    public String getNomePizza(){
        return nomePizza;
    }
    public void setNomePizza(String nome){
        this.nomePizza = nome;
    }
    public String getDescriçaoPizza(){
        return descriçaoPizza;
    }
    public void setDescriçaoPizza(String descriçao){
        this.descriçaoPizza = descriçao;
    }
    public TamanhoPizza getTamanhoPizza(){
        return tamanhopizza;
    }
    public void setTamanhoPizza(TamanhoPizza tamanhopizza){
        this.tamanhopizza = tamanhopizza;
    }
    public float getPreço(){
        return preço;
    }
    public void setPreço(float preço){
        this.preço = preço;
    }
    public int getNumIngredientes(){
        return numIngredientes;
    }
    public void setNumIngredientes(int numIngredientes){
        this.numIngredientes = numIngredientes;
    }
    public int[] coleçaoIngredientes(){
        return coleçaoIngredientes;
    }
    public void setColeçaoIngredientes(int[] coleçaoIngredientes){
        this.coleçaoIngredientes = coleçaoIngredientes;
    }
    public static String pizzaToString(TamanhoPizza tamanhopizza){
        switch(tamanhopizza){
            case PEQUENA :
            return "Pizza é pequena";
            case MEDIA :
            return "Pizza é média";
            case FAMILIAR :
            return "Pizza é familiar";
            default:
            throw new IllegalArgumentException("tamanho pizza inválido.");

        }
    }
    public void printPizza(){
        System.out.println("Codigo Pizza: "+ codigoPizza+"Nome: "+nomePizza);
        System.out.println("Descriçao Pizza: "+descriçaoPizza+"Tamanho: "+tamanhopizza);
        System.out.println("Preço: "+preço+"Qtd ingredientes: "+numIngredientes);

        for (int i : coleçaoIngredientes) {
            System.out.println(i+" ");
        }
         System.out.println();   
        }




}
