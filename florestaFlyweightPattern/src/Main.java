import com.digitalhouse.floresta.model.Arvore;
import com.digitalhouse.floresta.model.Floresta;

public class Main {
    public static void main(String[] args) {

        Floresta floresta = new Floresta();

        for(int i=0; i < 100000; i++){
            floresta.plantarArvore("Ornamentais",200, 400, "Verde");
            floresta.plantarArvore("Ornamentais",10, 10, "Verde");
            floresta.plantarArvore("Ornamentais",200, 100, "Azul");
            floresta.plantarArvore("Frutifera",500, 300, "Vermelho");
            floresta.plantarArvore("Florifera",100, 200, "Amarelo");
            floresta.plantarArvore("Florifera",200, 400, "Amarelo");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println(Arvore.contador); //quantas instancia criadas
        System.out.println(Floresta.getFLORESTA().size()); //quantas arvores plantadas
        System.out.println("Memoria utilizada " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024)); //memoria utilizada

    }
}