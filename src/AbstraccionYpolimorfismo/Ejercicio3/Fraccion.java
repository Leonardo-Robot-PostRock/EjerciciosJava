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

            if (this.denominador == otraFraccion.denominador) {
                int nuevoNumerador = calcularNumeradorConDenominadoresIguales(otraFraccion);
                return new Fraccion(nuevoNumerador, this.denominador);
            } else {
                int nuevoNumerador = calcularNuevoNumerador(otraFraccion);
                int nuevoDenominador = calcularDenominador(otraFraccion);
                return new Fraccion(nuevoNumerador, nuevoDenominador);
            }

        }
        return null;
    }



    private int calcularNuevoNumerador(Fraccion otraFraccion) {
        return (this.numerador * otraFraccion.denominador) + (this.denominador * otraFraccion.numerador);
    }

    private int calcularNumeradorConDenominadoresIguales(Fraccion otraFraccion){
        return this.numerador + otraFraccion.numerador;
    }

    private int calcularDenominador(Fraccion otraFraccion){
        return this.denominador * otraFraccion.denominador;
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;

            if (this.denominador == otraFraccion.denominador) {
                // Los denominadores son iguales, resta directa de numeradores
                int nuevoNumerador = calcularNumeradorRestaConDenominadoresIgualesResta(otraFraccion);
                return new Fraccion(nuevoNumerador, this.denominador);
            } else {
                // Los denominadores son diferentes, calcula el denominador común
                int nuevoNumerador = calcularNuevoNumeradorResta(otraFraccion);
                int nuevoDenominador = calcularNuevoDenominador(otraFraccion);
                return new Fraccion(nuevoNumerador, nuevoDenominador);
            }
        }
        return null;
    }

    private int calcularNumeradorRestaConDenominadoresIgualesResta(Fraccion otraFraccion){
        return this.numerador - otraFraccion.numerador;
    }

    private int calcularNuevoDenominador(Fraccion otraFraccion){
        return this.denominador * otraFraccion.denominador;
    }

    private int calcularNuevoNumeradorResta(Fraccion otraFraccion) {
        return (this.numerador * otraFraccion.denominador) - (this.denominador * otraFraccion.numerador);
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.numerador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;

            int nuevoNumerador = this.numerador * otraFraccion.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.numerador;

            // Manejar el caso en el que el denominador resultante sea cero
            if (nuevoDenominador == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }

            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }
}
