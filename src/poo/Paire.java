package poo;

import java.util.Collection;
import java.util.List;

public class Paire<A,B> {

    private A premier;
    private B second;
    public static Integer nbInstances = 0;

    public Paire(){
        this.premier = null;
        this.second = null;
        nbInstances++;
    }

    public Paire(A premier, B second){
        this.premier = premier;
        this.second = second;
        nbInstances++;
    }

    public A getPremier() {
        return premier;
    }

    public void setPremier(A a) {
        this.premier = a;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B b) {
        this.second = b;
    }

    public static <X,Y> void copiePremier(Paire<X,Y> p, X[] tab, int i){
        tab[i]=p.getPremier();
    }

    public static <X,Y> void copiePremier(Paire<X,Y> p, Collection<? super X> list){
        list.add(p.getPremier());
    }

    public boolean memePremier(Paire<?,?> p){
        return this.getPremier().equals(p.getPremier());
    }

    public <X,Y> boolean memePremier2(Paire<X,Y> p){
        return this.getPremier().equals(p.getPremier());
    }

    public <X extends A>void prendPremier(List<X> list){
        setPremier(list.get(0));
    }


    @Override
    public String toString() {
        return "(" + premier +
                "," + second +
                ")";
    }
}
