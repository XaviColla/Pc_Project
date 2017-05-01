package Prueb_Pc;
//@authors Christian Collaguazo, Adrián Flores, William Sanchez, Carlos Valladarez 
import edu.cmu.tetrad.graph.Dag;
import edu.cmu.tetrad.graph.Graph;
import edu.cmu.tetrad.search.IndTestDSep;
import edu.cmu.tetrad.search.IndependenceTest;
import edu.cmu.tetrad.search.Pc;
public class main_Pc {
    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Dag();
        IndependenceTest independenceTest = new IndTestDSep(graph);
        Pc pc = new Pc(independenceTest);
        
    }
    
}
