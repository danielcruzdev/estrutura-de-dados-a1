public class App {
    public static void main(String[] args) throws Exception {
        var console = System.console();
        String[] alunos = new String[25];
        int i;

        for (i = 0; i < 25; i++) {
            alunos[i] = console.readLine("Digite o nome do aluno: ");
        }

        try {
            for (i = 25; i < 30; i++) {
                alunos[i] = console.readLine("Digite o nome do aluno: ");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}