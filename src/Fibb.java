public class Fibb {
    public double fibb(double n){
        if(n > 3){
            return 1;
        } else {
            return fibb(n-2) + fibb( n-1);
        }
    }
}
