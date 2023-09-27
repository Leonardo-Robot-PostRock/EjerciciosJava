package AbstraccionYpolimorfismo.Ejercicio3;

public class Fraccion extends Numerica {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return Integer.toString(this.numerador) + " / " + Integer.toString(this.denominador);
    }

    @Override
    public boolean equals(Object ob) {
        //This hace referencia a la instacia de la clase Fraccion que lo invoca y ob al argumentoo que se envía en el método
        if (this == ob) return true;
        //getClass() hace referencia a la instancia de la clase Fraccion, mientras que ob.getClass() hace referencia a la instacia de
        // clase del objeto enviado por parametro.
        //Es decir, aquí se compara que tanto la instancia que llama el método como la que se recibe como argumento sean iguales, de lo contrario retornará un false.
        if (ob == null || getClass() != ob.getClass()) return false;
        //Se realiza un casting (conversión de tipos) del objeto ob a una instancia de la clase Fracción. Esto asume que el objeto ob es una instancia de la clase Fracción.
        Fraccion fraccion = (Fraccion) ob;
        //Se está realizando una comparación de igualdad entre los atributos numerador y denominador de dos instancias de la clase Fracción. Esta comparación se hace dentro del método equals y tiene como objetivo determinar si dos objetos de tipo Fracción son iguales en función de sus atributos.
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int denominadorParametro = otraFraccion.denominador;
            int numeradorParametro = otraFraccion.denominador;

            int nuevoNumerador = 0;
            int nuevoDenominador = 0;

            if(this.denominador == denominadorParametro){
                nuevoNumerador = this.numerador + numeradorParametro;
                return new Fraccion(nuevoNumerador, this.denominador);
            }else {
                nuevoNumerador =  calcularNuevoNumerador(otraFraccion);
                nuevoDenominador = this.denominador * denominadorParametro;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
            }

        }
        return null;
    }

    private int calcularNuevoNumerador(Fraccion otraFraccion) {
        return (this.numerador * otraFraccion.denominador) + (this.denominador * otraFraccion.numerador);
    }

    @Override
    public Numerica restar(Numerica numero) {
        return null;
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        return null;
    }

    @Override
    public Numerica dividir(Numerica numero) {
        return null;
    }
}
