import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class jogoPPT {

    public static void main(String[] args) {
        
        String[] nomesArray = {"Pedra", "Papel", "Tesoura"};
        List<String> listaDeOpcoes = new ArrayList<>(Arrays.asList(nomesArray));

        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaDeOpcoes.size());
        String escolhaMaquina = listaDeOpcoes.get(indiceAleatorio);

        System.out.println("JOGO - Pedra, Papel, Tesoura");
        System.out.println("Digite a sua escolha: ");
        Scanner entrada = new Scanner(System.in);
        String escolhaUsuario = entrada.nextLine().toLowerCase();

        while (true) {

            if ((escolhaMaquina.equals("Pedra") && escolhaUsuario.equals("pedra")) || 
                (escolhaMaquina.equals("Tesoura") && escolhaUsuario.equals("tesoura")) || 
                (escolhaMaquina.equals("Papel") && escolhaUsuario.equals("papel"))) {
                System.out.println("****************");
                System.out.println("Você: " + escolhaUsuario);
                System.out.println("Máquina: " + escolhaMaquina);
                System.out.println("Empate! Tente mais uma!");
                System.out.println("****************");
            }
            else if ((escolhaMaquina.equals("Pedra") && escolhaUsuario.equals("papel")) || 
                     (escolhaMaquina.equals("Tesoura") && escolhaUsuario.equals("pedra")) || (escolhaMaquina.equals("Papel") && escolhaUsuario.equals("tesoura"))) {
                System.out.println("****************");        
                System.out.println("Você: " + escolhaUsuario);
                System.out.println("Máquina: " + escolhaMaquina);        
                System.out.println("Você ganhou!");
                System.out.println("****************");
            }   
            else if ((escolhaMaquina.equals("Pedra") && escolhaUsuario.equals("tesoura")) || 
                     (escolhaMaquina.equals("Tesoura") && escolhaUsuario.equals("papel")) || (escolhaMaquina.equals("Papel") && escolhaUsuario.equals("pedra"))) {
                System.out.println("****************");
                System.out.println("Você: " + escolhaUsuario);
                System.out.println("Máquina: " + escolhaMaquina);        
                System.out.println("A máquina ganhou!");
                System.out.println("****************");
            }     
            else {
                System.out.println("O texto é inválido. Digite Novamente!");
                System.out.println("Digite a sua escolha: ");
                escolhaUsuario = entrada.nextLine();
                continue;
            }
            break;                
        }
        entrada.close();
    }
}
