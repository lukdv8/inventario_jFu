import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
    	/*String tempNome;
    	double tempPreco;
    	int tempQtde;
    	int tempCod;
    	boolean tempAtivo = true;
    	
    	
    	Scanner in = new Scanner (System.in);
    	
    	System.out.print("Nome: ");
    	tempNome = in.nextLine();
    	
    	System.out.print("Valor: ");
    	tempPreco = in.nextDouble();
    	
    	System.out.print("Quantidade: ");
    	tempQtde = in.nextInt();
    	
    	System.out.print("Codigo: ");
    	tempCod = in.nextInt();

        Produto vbrakeNylon = new Produto(tempNome, tempPreco, tempQtde, tempCod, tempAtivo);

        in.nextLine();

        System.out.print("Nome: ");
    	tempNome = in.nextLine();
    	
    	System.out.print("Valor: ");
    	tempPreco = in.nextDouble();
    	
    	System.out.print("Quantidade: ");
    	tempQtde = in.nextInt();
    	
    	System.out.print("Codigo: ");
    	tempCod = in.nextInt();
        in.close();

        Produto vbrakeAlum = new Produto(tempNome, tempPreco, tempQtde, tempCod, tempAtivo);
        
        //vbrakeAlum.setEstaAtivo(false);*/
    	
        Produto corrente1 = new Produto("Yaban Index 24v", 80.0, 5, 1, true);
        Produto corrente2 = new Produto("Yaban Comum 21v", 60.0, 5, 2, true);
        Produto catraca3 = new Produto("Catraca de 6", 60.0, 20, 3, true);
        Produto catraca4 = new Produto("Catraca de 7", 70.0, 20, 4, true);

        System.out.println(corrente1);
        System.out.println(corrente2);
        System.out.println(catraca3);
        System.out.println(catraca4);
        catraca4.setQtdeEstoque(0);
        System.out.println(catraca4);
        //System.out.println(vbrakeNylon);
        //System.out.println(vbrakeAlum);

    }
}