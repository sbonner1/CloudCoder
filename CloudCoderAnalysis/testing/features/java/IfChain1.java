public class Test {
    public boolean isBetween(int a, int b, int c) {
        if (a>=b && a<=c){
            return true;
        }
        else if (a<=b && a>=c){
            return true;
        }
        else if (a<-1000) {
            return true;
        }
        else {
            return false;
        }
    } 
} 
