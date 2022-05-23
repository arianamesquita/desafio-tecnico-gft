import desafios.Macaco;
import desafios.NumeroReverso;
import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

public class Main {
    public static void main(String[] args) {
        //NumeroReverso.numeroReverso();

/*        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco1.comer("banana");
        macaco1.comer("pêra");

        macaco2.comer("pêra");
        macaco2.comer("uva");
        macaco2.comer("maça");

        System.out.println("-------");

        macaco1.digerir();
        macaco1.digerir();
        macaco1.digerir();
        macaco1.digerir();

        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();*/

        Vendedor vendedor = new Vendedor("Ariana Mesquita", 12398563418L, 10d, 5);
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Consultor 1", 78969536412L, 100.5d, 10);
        System.out.println(consultor.getNome());
        System.out.println(consultor.calcularSalario());
    }
}
