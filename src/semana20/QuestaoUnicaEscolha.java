package semana20;

public class QuestaoUnicaEscolha extends Questao {
    private String respostaCorreta; 
        
    public QuestaoUnicaEscolha(int numero, String enunciado, String respostaCorreta) { 
        super(numero, enunciado); 
        this.respostaCorreta = respostaCorreta; 
    } 
        public boolean validarResposta(String resposta) { 
        return resposta.equalsIgnoreCase(respostaCorreta); 
    }
        public int getPontuacao() {
            return 1;
        }
}
        