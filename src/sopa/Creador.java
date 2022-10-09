package sopa;
import java.util.Scanner;

public class Creador {
int Ancho;
int Alto;
Scanner Dato=new Scanner(System.in);

/*Crea una matriz con el alto y ancho especificado*/
protected char[][] CreaSopa() {
	System.out.println("Digite el ancho de la sopa de letras");
	Ancho=Dato.nextInt();
	System.out.println("Digite el alto de la sopa de letras");
	Alto=Dato.nextInt();
	char Sopa[][]= new char[Ancho][Alto];
	return Sopa;
}

/*Pregunta qué valor asignar a cada espacio de la matriz*/
protected char[][] LlenaSopa(char Sopa[][]) {
	int a=0;
	int b=0;
while(a<Alto) {
	while(b<Ancho) {
		System.out.println("Inserte dato para la coordenada "+b+" "+a);
		String Entrada=Dato.next();
		if(Entrada.length()!=1||Entrada==null) {
			System.out.println("Has ingresado una cantidad de carácteres diferente a uno (1)");
			break;
		}
		else {
		Sopa[b][a]=Entrada.charAt(0);
		b=b+1;
	}
}
	a=a+1;
	b=0;
}
return Sopa;
}
}