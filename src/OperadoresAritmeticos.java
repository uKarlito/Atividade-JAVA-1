public class OperadoresAritmeticos {
    public static void main(String[] args) {

        //Declarar 3 variáveis (notaCheckPoint, notaChallenge, notaGlobalSolution)
        float notaCheckPoint, notaChallenge, notaGlobalSolution;

        //Atribuindo valores às notas.
        notaCheckPoint = 5.0f;
        notaChallenge= 3.0f;
        notaGlobalSolution = 2.0f;

        //Calcula e exibe a média do semestre.
        System.out.println("Media do semestre: " + (notaCheckPoint + notaChallenge + notaGlobalSolution) / 3);
    }
}
