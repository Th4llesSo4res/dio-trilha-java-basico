public class ExemploforArray {
    public static void main(String[] args) {
        // Array é uma rede/lista de informções com uma condição; o indice inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // length = tamanho
        for (int x=0; x < alunos.length; x++){

            System.out.println("O aluno no indice x="  +  x  + "  é  " +  alunos  [ x ] );

        }
        // Forma reduzida
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
