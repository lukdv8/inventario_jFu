
public class ProductTester {
    public static void main(String[] args) {
        Produto corrente1 = new Produto("Yaban Index 24v", 80.0, 5, 1);
        Produto corrente2 = new Produto("Yaban Comum 21v", 60.0, 5, 2);
        Produto catraca3 = new Produto("Catraca de 6", 60.0, 20, 3);
        Produto catraca4 = new Produto("Catraca de 7", 70.0, 20, 4);
        Produto vbrakeAlum = new Produto();
        Produto vbrakeNylon = new Produto();

        System.out.println(corrente1);
        System.out.println(corrente2);
        System.out.println(catraca3);
        System.out.println(catraca4);
        System.out.println(vbrakeAlum);
        System.out.println(vbrakeNylon);
    }
}