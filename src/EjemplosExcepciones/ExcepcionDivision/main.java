package ExcepcionDivision;

public class main {
    public static void main(String [] args){
        DividebyZero test=new DividebyZero(2,0);
        try{
            test.divide();
        }
        catch(MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}
