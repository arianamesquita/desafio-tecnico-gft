package desafios;

/* Classe Macaco:
         Fa�a um programa e teste interativamente uma classe que modele um macaco com os atributos ?nome? e
         ?bucho? (est�mago) e os m�todos ?comer?, ?verBucho? e ?digerir?.

         Regras:
         a) Crie 2 macacos;
         b) Considere que a quantidade m�xima de alimentos � 3. Com isso, lembre-se de verificar o conte�do do
             est�mago a cada refei��o (m�todo ?comer?). Por fim, o m�todo ?digerir? deve esvaziar o bucho do Macaco;
         c) Alimentos ?diger�veis? devem ser do tipo String, garanta isso em seu c�digo para que n�o haja nenhum
             Macaco canibal ?.*/

import java.util.ArrayList;
import java.util.List;

public class Macaco {
// atributos
    private String nome;
    private List<String> bucho = new ArrayList<>();

    // metodos
    public void comer(String comida){
        if (bucho.size() == 3){
            System.out.println("Bucho cheio!");
        } else {
            bucho.add(comida);
        }
        System.out.println(bucho);
    }

    public void digerir(){
        if (bucho.isEmpty()){
            System.out.println("Bucho vazio!");
        } else {
            bucho.remove(bucho.get(0));
        }
        System.out.println(bucho);
    }
}
