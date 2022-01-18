import poo.Paire;
import test.TestUnitairePaire;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String args[]){
        /*Paire<Integer,String> p1 = new Paire<Integer,String>(9,"plus grand chiffre");
        Paire<Integer,Integer> p2 = new Paire<Integer,Integer>(9,10);
        assert p1.<Integer,Integer>memePremier(p2) == true;
        Integer [] tab = new Integer[1];
        Paire.<Integer,String>copiePremier(p1,tab,0);
        assert tab[0].equals(9) && tab[0]==9 && tab[0].equals( new Integer(9))
                && tab[0] != new Integer(9) ;
        assert p1.getClass() == p2.getClass() ;
        assert p1.getClass().getSimpleName().equals( "poo.Paire");
        Paire<?,?> p4 = new Paire<Integer,String>();
        ((Paire<Integer, String>)p4).setPremier(12);
        System.out.print("NB = "+Paire.nbInstances);
        assert (p4.toString().equals("(12,null)"));
        //assert false:"Fin du test";

        Paire<Object,String> p5 = new Paire<Object,String>();
        List<Object> lo= new LinkedList<Object>();
        List<Integer> li = new LinkedList<Integer>();
        li.add(5);
        lo.add(2.5f);
        p5.prendPremier(lo); assert (Float)p5.getPremier() == 2.5f ;
        p5.prendPremier(li); assert (Integer)p5.getPremier() == 5;

        Paire<Integer,Integer> p6 = new Paire<Integer,Integer>(9,10);
        Collection<Object> co = new LinkedList<Object>();
        Collection<Integer> ci = new LinkedList<Integer>();
        Paire.copiePremier(p6,co);
        Paire.copiePremier(p6,ci);
        assert co.toString().equals("[9]");
        assert ci.toString().equals("[9]");*/

        TestUnitairePaire.allTest();
    }

}
