import javax.swing.*;

public class EjercicioCond2 {
    public static void main(String[]args){
        double nota1, nota2, nota3, promedio;
        String strNota1, strNota2, strNota3;

        strNota1 = JOptionPane.showInputDialog("Ingrese nota 1");
        strNota2 = JOptionPane.showInputDialog("Ingrese nota 2");
        strNota3 = JOptionPane.showInputDialog("Ingrese nota 3");

        //Zona de cálculo
        nota1 = Double.parseDouble(strNota1);
        nota2 = Double.parseDouble(strNota2);
        nota3 = Double.parseDouble(strNota3);

        //Zona de cálculo
        promedio = (nota1 + nota2 + nota3)/3;

        if(promedio >= 7){
            JOptionPane.showMessageDialog(null, "APROBADO");
        }else {
            JOptionPane.showMessageDialog(null, "DESAPROBADO");
        }
    }
}
