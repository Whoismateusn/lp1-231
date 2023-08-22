package semana20;
import java.util.ArrayList;
import java.util.List;


public class Prova {
    private List questoes;
    private int pontuacaoTotal;

    

    public Prova() {
    questoes = new ArrayList<>();
    pontuacaoTotal = 0;
    }



    public void adicionarQuestao(Questao questao) {
    questoes.add(questao);
    pontuacaoTotal++;
    }
    



    public int getPontuacaoTotal() {
    return pontuacaoTotal;
    }
}

