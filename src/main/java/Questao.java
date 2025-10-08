public class Questao {
    private String pergunta;
    private String[] alternativas;
    private String respostaCorreta;
    private String letraCorreta;

    public Questao(String pergunta, String[] alternativas, String respostaCorreta, String letraCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
        this.letraCorreta = letraCorreta;
    }

    public void exibirQuestao(int numero) {
        System.out.println(numero + ". " + pergunta);
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i]);
        }
    }

    public boolean verificarResposta(String resposta) {
        return resposta.equalsIgnoreCase(letraCorreta);
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getLetraCorreta() {
        return letraCorreta;
    }
}