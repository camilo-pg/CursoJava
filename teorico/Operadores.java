public class Operadores {
    public static void main(String[] args) {
        //Operadores Aritmeticos
        int a = 5, b = 4;

        //Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);
        //Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);
        //Multiplicacion
        int multi = a * b;
        System.out.println("Multiplicacion: " + multi);
        //Division
        int div = a/b;
        System.out.println("Division: " + div);
        //Resto de la dividios
        int resto = a % b;
        System.out.println("Resto: " + resto);

        //Operadores de Asignacion
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Asignacion con suma: " + c);
        c -= 3; // c = c - 3
        System.out.println("Asignacion con resta: " + c);
        c *= 2; // c = c * 2
        System.out.println("Asignacion con multiplicacion: " + c);
        c /= 4; // c = c / 4
        System.out.println("Asignacion con division: " + c);
        c %= 3; // c = c % 3
        System.out.println("Asignacion con resto: " + c);

        //Operadores Incremento y Decremento
        int d = 5;
        d++; // Incremento
        System.out.println("Incremento: " + d);
        d--; // Decremento
        System.out.println("Decremento: " + d);
        int j = d++; //PreIncremento
        System.out.println("PreIncremento: " + j);
        j = d++; //PostIncremento
        System.out.println("PostIncremento: " + j);

        //Operadores Relacionales
        int e = 3, f = 4;
        boolean b1 = e == f; //Igualdad
        System.out.println("Igualdad: " + b1);
        boolean b2 = e != f; //Distinto
        System.out.println("Desigualdad: " + b2);
        boolean b3 = e > f; //Mayor que
        System.out.println("Mayor que: " + b3);
        boolean b4 = e < f; //Menor que
        System.out.println("Menor que: " + b4);
        boolean b5 = e >= f; //Mayor o igual que
        System.out.println("Mayor o igual que: " + b5);
        boolean b6 = e <= f; //Menor o igual que
        System.out.println("Menor o igual que: " + b6);

        //Operadores Logicos
        boolean x = true, y = false;
        boolean and = x && y; //AND
        System.out.println("AND: " + and);
        boolean or = x || y; //OR
        System.out.println("OR: " + or);
        boolean not = !x; //NOT
        System.out.println("NOT: " + not);

        //Operador Ternario
        int edad = 18;
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);
    }
}
