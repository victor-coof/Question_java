import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acertos = 0;
        int erros = 0;
        int totalQuestoes = 15;
        String resposta;

        System.out.println("=== QUIZ DE CONHECIMENTOS GERAIS ===\n");

        // Questão 1
        System.out.println("1. Qual é a capital da França?");
        System.out.println("a) Londres\nb) Paris\nc) Roma\nd) Madri");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Paris\n");
            erros++;
        }

        // Questão 2
        System.out.println("2. Quem desenvolveu a teoria da relatividade?");
        System.out.println("a) Isaac Newton\nb) Albert Einstein\nc) Galileu Galilei\nd) Stephen Hawking");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Albert Einstein\n");
            erros++;
        }

        // Questão 3
        System.out.println("3. Qual é o maior animal terrestre?");
        System.out.println("a) Girafa\nb) Rinoceronte\nc) Elefante africano\nd) Hipopótamo");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) Elefante africano\n");
            erros++;
        }

        // Questão 4
        System.out.println("4. Em que ano acabou a Segunda Guerra Mundial?");
        System.out.println("a) 1943\nb) 1944\nc) 1945\nd) 1946");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) 1945\n");
            erros++;
        }

        // Questão 5
        System.out.println("5. Qual é o menor país do mundo?");
        System.out.println("a) Mônaco\nb) Vaticano\nc) San Marino\nd) Malta");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Vaticano\n");
            erros++;
        }

        // Questão 6
        System.out.println("6. Quantos planetas existem no Sistema Solar?");
        System.out.println("a) 7\nb) 8\nc) 9\nd) 10");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) 8\n");
            erros++;
        }

        // Questão 7
        System.out.println("7. Qual é o rio mais longo do mundo?");
        System.out.println("a) Rio Nilo\nb) Rio Amazonas\nc) Rio Yangtzé\nd) Rio Mississipi");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("a")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: a) Rio Nilo\n");
            erros++;
        }

        // Questão 8
        System.out.println("8. Qual é o gás mais abundante na atmosfera terrestre?");
        System.out.println("a) Oxigênio\nb) Nitrogênio\nc) Dióxido de carbono\nd) Hidrogênio");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Nitrogênio\n");
            erros++;
        }

        // Questão 9
        System.out.println("9. Quem pintou 'A Última Ceia'?");
        System.out.println("a) Michelangelo\nb) Leonardo da Vinci\nc) Rafael\nd) Caravaggio");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Leonardo da Vinci\n");
            erros++;
        }

        // Questão 10
        System.out.println("10. Qual é a montanha mais alta do mundo?");
        System.out.println("a) K2\nb) Monte Kilimanjaro\nc) Monte Everest\nd) Monte Fuji");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) Monte Everest\n");
            erros++;
        }

        // Questão 11
        System.out.println("11. Quantos dentes tem um ser humano adulto?");
        System.out.println("a) 28\nb) 30\nc) 32\nd) 34");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) 32\n");
            erros++;
        }

        // Questão 12
        System.out.println("12. Qual é o metal mais precioso?");
        System.out.println("a) Ouro\nb) Platina\nc) Ródio\nd) Prata");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) Ródio\n");
            erros++;
        }

        // Questão 13
        System.out.println("13. Em que continente fica o Egito?");
        System.out.println("a) Ásia\nb) África\nc) Europa\nd) América");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) África\n");
            erros++;
        }

        // Questão 14
        System.out.println("14. Qual é a língua mais falada no mundo?");
        System.out.println("a) Inglês\nb) Mandarim\nc) Espanhol\nd) Hindi");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("b")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: b) Mandarim\n");
            erros++;
        }

        // Questão 15
        System.out.println("15. Qual é o órgão do corpo humano que bombeia sangue?");
        System.out.println("a) Fígado\nb) Pulmão\nc) Coração\nd) Rim");
        System.out.print("Resposta: ");
        resposta = sc.nextLine().toLowerCase();
        if (resposta.equals("c")) {
            System.out.println("✓ Correto!\n");
            acertos++;
        } else {
            System.out.println("✗ Errado! A resposta correta é: c) Coração\n");
            erros++;
        }

        // Resultado Final
        double porcentagemAcertos = (acertos * 100.0) / totalQuestoes;
        double porcentagemErros = (erros * 100.0) / totalQuestoes;

        System.out.println("\n=================================");
        System.out.println("       RESULTADO FINAL");
        System.out.println("=================================");
        System.out.println("Total de questões: " + totalQuestoes);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
        System.out.printf("Porcentagem de erros: %.2f%%\n", porcentagemErros);
        System.out.println("=================================");

        if (porcentagemAcertos >= 80) {
            System.out.println("Brabo! Parabéns!");
        } else if (porcentagemAcertos >= 60) {
            System.out.println("Bom trabalho! Continue estudando!");
        } else {
            System.out.println("Bora aumentar esse Q.I");
        }

        sc.close();
    }
}