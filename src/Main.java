import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // lista simples de numeros inteiros
        List<Integer> pedidosNumero = new ArrayList<>();
        pedidosNumero.add(1234);
        pedidosNumero.add(567);
        pedidosNumero.add(98);

        pedidosNumero.forEach(System.out::println);


        // criou 1 objeto pedido
        Pedido pedido1 = new Pedido(1, "Banana", 5.00 );

        // lista de pedidos
        List<Pedido> carrinhoCompras = new ArrayList<>();
        carrinhoCompras.add(pedido1);
        carrinhoCompras.add(new Pedido(2, "Melancia", 8.00));

        System.out.println("------------------------");

        // retornar com o metodo sobrescrito para json.
        carrinhoCompras.forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println(carrinhoCompras.get(1));                     // retorna o objeto todo da lista
        System.out.println(carrinhoCompras.get(1).getValor());          // retorna o atributo do objeto na lista




    }
}