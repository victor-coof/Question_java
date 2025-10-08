import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o array de questões
        Questao[] questions = criarQuestoes();

        int acertos = 0;
        int erros = 0;
        int totalQuestoes = questions.length;

        System.out.println("=== QUIZ DE CONHECIMENTOS GERAIS ===\n");

        // Executando o quiz
        for (int i = 0; i < questions.length; i++) {
            questions[i].exibirQuestao(i + 1);
            System.out.print("Resposta: ");
            String resposta = sc.nextLine().toLowerCase();

            if (questions[i].verificarResposta(resposta)) {
                System.out.println("✓ Correto!\n");
                acertos++;
            } else {
                System.out.println("✗ Errado! A resposta correta é: " +
                        questions[i].getLetraCorreta() + ") " + questions[i].getRespostaCorreta() + "\n");
                erros++;
            }
        }

        // Exibindo resultados
        exibirResultados(acertos, erros, totalQuestoes);
        sc.close();
    }

    private static Questao[] criarQuestoes() {
        Questao[] questions = new Questao[15];

        questions[0] = new Questao(
                "Qual é a capital do Brasil?",
                new String[]{"a) São Paulo", "b) Rio de Janeiro", "c) Brasília", "d) Salvador"},
                "Brasília", "c"
        );

        questions[1] = new Questao(
                "Quantos continentes existem no mundo?",
                new String[]{"a) 5", "b) 6", "c) 7", "d) 8"},
                "6", "b"
        );

        questions[2] = new Questao(
                "Quem pintou a Mona Lisa?",
                new String[]{"a) Michelangelo", "b) Leonardo da Vinci", "c) Rafael", "d) Donatello"},
                "Leonardo da Vinci", "b"
        );

        questions[3] = new Questao(
                "Qual é o maior planeta do Sistema Solar?",
                new String[]{"a) Terra", "b) Marte", "c) Júpiter", "d) Saturno"},
                "Júpiter", "c"
        );

        questions[4] = new Questao(
                "Em que ano o homem pisou na Lua pela primeira vez?",
                new String[]{"a) 1965", "b) 1969", "c) 1972", "d) 1975"},
                "1969", "b"
        );

        questions[5] = new Questao(
                "Qual é o metal mais abundante na crosta terrestre?",
                new String[]{"a) Ferro", "b) Alumínio", "c) Cobre", "d) Ouro"},
                "Alumínio", "b"
        );

        questions[6] = new Questao(
                "Quem escreveu 'Dom Casmurro'?",
                new String[]{"a) José de Alencar", "b) Machado de Assis", "c) Carlos Drummond de Andrade", "d) Clarice Lispector"},
                "Machado de Assis", "b"
        );

        questions[7] = new Questao(
                "Qual é a fórmula química da água?",
                new String[]{"a) H2O", "b) CO2", "c) O2", "d) NaCl"},
                "H2O", "a"
        );

        questions[8] = new Questao(
                "Quantos estados tem o Brasil?",
                new String[]{"a) 24", "b) 25", "c) 26", "d) 27"},
                "26", "c"
        );

        questions[9] = new Questao(
                "Qual é o oceano mais profundo do mundo?",
                new String[]{"a) Atlântico", "b) Índico", "c) Ártico", "d) Pacífico"},
                "Pacífico", "d"
        );

        questions[10] = new Questao(
                "Qual é a velocidade da luz no vácuo?",
                new String[]{"a) 150.000 km/s", "b) 200.000 km/s", "c) 300.000 km/s", "d) 400.000 km/s"},
                "300.000 km/s", "c"
        );

        questions[11] = new Questao(
                "Quem descobriu o Brasil?",
                new String[]{"a) Cristóvão Colombo", "b) Pedro Álvares Cabral", "c) Vasco da Gama", "d) Fernando de Magalhães"},
                "Pedro Álvares Cabral", "b"
        );

        questions[12] = new Questao(
                "Qual é o menor país do mundo?",
                new String[]{"a) Mônaco", "b) San Marino", "c) Vaticano", "d) Liechtenstein"},
                "Vaticano", "c"
        );

        questions[13] = new Questao(
                "Quantos ossos tem o corpo humano adulto?",
                new String[]{"a) 186", "b) 206", "c) 226", "d) 246"},
                "206", "b"
        );

        questions[14] = new Questao(
                "Qual é a moeda oficial do Japão?",
                new String[]{"a) Yuan", "b) Won", "c) Iene", "d) Rupia"},
                "Iene", "c"
        );

        return questions;
    }

    private static void exibirResultados(int acertos, int erros, int totalQuestoes) {
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
            System.out.println("Excelente! Parabéns!");
        } else if (porcentagemAcertos >= 60) {
            System.out.println("Bom trabalho! Continue estudando!");
        } else {
            System.out.println("Você pode melhorar! Estude mais!");
        }
    }
}