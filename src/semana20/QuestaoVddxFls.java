package semana20;

public class QuestaoVddxFls extends Questao{
    private boolean respostaCorreta; 
    public QuestaoVddxFls(int numero, String enunciado, boolean respostaCorreta) { 
        super(numero, enunciado); this.respostaCorreta = respostaCorreta; 
    } 
    public boolean validarResposta(String resposta) { 
        return resposta.equalsIgnoreCase("V") == respostaCorreta; 
    } 
    public int getPontuacao() { 
        return respostaCorreta ? 1 : 0; 
    }
}

    