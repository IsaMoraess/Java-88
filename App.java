/*"Desenvolva um programa em Java chamado ResultadoEscolar que avalie o desempenho de um aluno
com base em sua nota. O programa deve inicializar a variável 'nota' com o valor 6.
Em seguida, o programa deve verificar se a nota é maior ou igual a 7.
Se for, o programa deve imprimir 'Aprovado', caso contrário, deve imprimir 'Reprovado'." */
public class App {
    public static void main(String[] args) throws Exception {
        int nota = 6;

        //controle de fluxo condicional
            if(nota >= 7)
                System.out.println("Aprovado");

            else
            System.out.println("Reprovado");
    }
}
