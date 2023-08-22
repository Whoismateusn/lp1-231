package semana20;
import java.util.List;

public class QuestaoMultiplaEscolha extends Questao {
        private List respostasCorretas; 

        public QuestaoMultiplaEscolha(int numero, String enunciado, List respostasCorretas) { 
            super(numero, enunciado); 
            this.respostasCorretas = respostasCorretas; 
        } 

        public boolean validarResposta(String resposta) { 
           
            return respostasCorretas.contains(resposta); 
        } 
        public int getPontuacao() { 
            return respostasCorretas.size(); 
        }
    }



