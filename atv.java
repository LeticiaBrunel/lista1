import java.util.Scanner;
public class atv{

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        Float soma,sub,mut,div,n1,n2;
        System.out.println("Digite o primeiro número");
        n1 = leia.nextFloat();
        System.out.println("Digite o segundo número");
        n2 = leia.nextFloat();
        soma= n1+n2;
        sub = n1-n2;
        mut = n1*n2;
        div = n1/n2;
        System.out.println("Soma: "+ soma);
        System.out.println("Subtração:"+sub);
        System.out.println("Multiplicação:" + mut);
        System.out.println("Divisão:" + div);
    }
}