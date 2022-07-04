package com.mycompany.reto1y2ciclo2;

import javax.swing.JOptionPane;



//Comentario de prueba repositorio
public class Reto1y2Ciclo2 {

    public static void main(String[] args) {

        final String MenuPrincipal = """
                                 Seleccione una opcion:
                                 1. Realizar una operacion
                                 2. Salir
                                 """;
        
        String menu = JOptionPane.showInputDialog(null, MenuPrincipal);

        switch (menu) {
            case "1":
                volverMenu();

            case "2":
                break;
            default:

                JOptionPane.showMessageDialog(null, "Opcion incorrecta");

        }

    }
    
    public static void volverMenu(){
        
        final String seleccionDeOperacion = """
                                                     Seleccione una operacion:  
                                                       1. Suma 
                                                       2. Resta 
                                                       3. Multiplicacion                                                       
                                                       4. Division
                                                       5. Potencia                                                    
                                                       6. Raiz cuadrada
                                                       7. Salir""";
        String operacion = JOptionPane.showInputDialog(null, seleccionDeOperacion);
                switch (operacion) {
                    case "1":                       //Suma
                        String num1suma = JOptionPane.showInputDialog(null, "Ingrese primer numero: ");
                        if (esNumero(num1suma)){
                            int caracter=Integer.parseInt(num1suma);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                        }
                        String num2suma = JOptionPane.showInputDialog(null, "Ingrese segundo numero: ");
                        if (esNumero(num2suma)){
                            int caracter=Integer.parseInt(num2suma);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }                        
                        double resultadoS = Double.parseDouble(num1suma) + Double.parseDouble(num2suma);
                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + Math.round(resultadoS * 100.0) / 100.0);
                        volverMenu();
                        break;
                    case "2":                       //Resta
                        String num1resta = JOptionPane.showInputDialog(null, "Ingrese primer numero: ");
                        if (esNumero(num1resta)){
                            int caracter=Integer.parseInt(num1resta);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                        }
                        String num2resta = JOptionPane.showInputDialog(null, "Ingrese segundo numero: ");
                        if (esNumero(num2resta)){
                            int caracter=Integer.parseInt(num2resta);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }
                        double resultado = Double.parseDouble(num1resta) - Double.parseDouble(num2resta);
                        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + Math.round(resultado * 100.0) / 100.0);
                        volverMenu();
                        break;
                    case "3":                       //Multiplicacion
                        String num1multiplicacion = JOptionPane.showInputDialog(null, "Ingrese primer numero: ");
                        if (esNumero(num1multiplicacion)){
                            int caracter=Integer.parseInt(num1multiplicacion);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                        }
                        String num2multiplicacion = JOptionPane.showInputDialog(null, "Ingrese segundo numero: ");
                        if (esNumero(num2multiplicacion)){
                            int caracter=Integer.parseInt(num2multiplicacion);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }
                        double resultadom = Double.parseDouble(num1multiplicacion) * Double.parseDouble(num2multiplicacion);
                        JOptionPane.showMessageDialog(null, "El resultado de la Multiplicacion es: " + Math.round(resultadom * 100.0) / 100.0);
                        volverMenu();
                        break;
                    case "4":                       //Division
                        String num1division = JOptionPane.showInputDialog(null, "Ingrese primer numero: ");
                        if (esNumero(num1division)){
                            int caracter=Integer.parseInt(num1division);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                        }
                        String num2division = JOptionPane.showInputDialog(null, "Ingrese segundo numero: ");
                        if (esNumero(num2division)){
                            int caracter=Integer.parseInt(num2division);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }
                        if (num2division.equals("0")) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                        } else {
                            double resultadod = Double.parseDouble(num1division) / Double.parseDouble(num2division);
                             JOptionPane.showMessageDialog(null, "El resultado de la Division es: " + "\n" +  Math.round(resultadod * 100.0) / 100.0);
                        }
                        volverMenu();
                        break;
                    case "5":                       //Potencia
                        String num1potencia = JOptionPane.showInputDialog(null, "Ingrese el numero base: ");
                        if (esNumero(num1potencia)){
                            int caracter=Integer.parseInt(num1potencia);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                        }
                        String num2potencia = JOptionPane.showInputDialog(null, "Ingrese el numero exponente: ");
                        if (esNumero(num2potencia)){
                            int caracter=Integer.parseInt(num2potencia);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }
                        double base = Double.parseDouble(num1potencia);
                        double exponente = Double.parseDouble(num2potencia);
                        resultado = Math.pow(base, exponente);
                        JOptionPane.showMessageDialog(null, "El resultado de la Potencia es: " + Math.round(resultado * 100.0) / 100.0);
                        volverMenu();
                        break;
                    case "6":                       //Raiz
                        String num1raiz = JOptionPane.showInputDialog(null, "Ingrese el numero ha averiguar raiz: ");
                        //  String num2raiz = JOptionPane.showInputDialog(null, "Ingrese segundo numero: ");
                        if (esNumero(num1raiz)){
                            int caracter=Integer.parseInt(num1raiz);
                        } else{
                            JOptionPane.showMessageDialog(null,"Caracter no valido");
                            volverMenu();
                        }
                        double numeroraiz = Double.parseDouble(num1raiz);
                        resultado = Math.sqrt(numeroraiz);
                        JOptionPane.showMessageDialog(null, "El resultado de la Raiz es: " + Math.round(resultado * 100.0) / 100.0);
                        volverMenu();
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "Salir");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una operacion valida");
                        volverMenu();
                        break;
                }
                
}
    
    public static boolean esNumero(String strNum){
        if (strNum==null){
            return false;
        }
        try{
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe){
            return false;
        }
            return true;
    }
}