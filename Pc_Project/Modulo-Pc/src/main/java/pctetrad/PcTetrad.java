/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctetrad;

/**
 *
 * @author Christian Collaguazo
 */
public class PcTetrad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Dag();
        IndependenceTest independenceTest = new IndTestDSep(graph);
        Pc pc = new Pc(independenceTest);
    }
    
}
