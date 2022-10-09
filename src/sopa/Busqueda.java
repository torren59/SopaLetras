package sopa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Busqueda extends Creador {

	String Palabra;
	Scanner Dato=new Scanner(System.in);
	int Len;
	char LetraDiv;
	char LBuscLine;
	boolean Verif;
	int LAct = 0;
	int C_Alto = 0;
	int C_Ancho = 0;
	boolean BusVenActiv = false;
	char Sopa[][];
	boolean SX, RX, SY, RY = true;
	// Liderazgo
	boolean Lid = true;
	boolean Lid1, Lid2, Lid3, Lid4, Lid5, Lid6, Lid7, Lid8;
	// Efectividad
	boolean E1, E2, E3, E4, E5, E6, E7, E8;
	// Usos que ha tenido un un método de búsqueda vecinal
	int Uso1, Uso2, Uso3, Uso4, Uso5, Uso6, Uso7, Uso8 = 0;
	int AnchoAlm[];
	int AltoAlm[];
	boolean Final=false;
	int cont;


	private void Iniciar() {
		Sopa = LlenaSopa(CreaSopa());
	}
	
	private int[] CreaAlmacen() {
		int Almacen[]= new int[Len];
		return Almacen;
	}

	public void Solicitador() {
		int a=0;
		System.out.println("Digite la palabra a buscar en mayúscula");
		Palabra = Dato.next();
		Len = Palabra.length();
		AnchoAlm=CreaAlmacen();
		AltoAlm=CreaAlmacen();
		while(a<Len) {
			AnchoAlm[a]=-1;
			AltoAlm[a]=-1;
			a=a+1;
			System.out.println("Vaciando Almacenes");
		}
		
	}

	private void Divisor() {
		LetraDiv = Palabra.charAt(LAct);
		System.out.println("Divisor "+LAct);
	}

	private void BuscLineal() {
		LBuscLine = Sopa[C_Ancho][C_Alto];
		System.out.println("Busc Lineal "+C_Ancho+" "+C_Alto);
		if(BusVenActiv==false) {
			AnchoAlm[0]=C_Ancho;
			AltoAlm[0]=C_Alto;
			System.out.println("Zona 1 save "+C_Ancho+" "+C_Alto);
		}
	}

	private void Verificador() {
		if (LetraDiv == LBuscLine) {
			Verif = true;
			BusVenActiv = true;
			System.out.println("Verif T");
		} else {
			Verif = false;
			System.out.println("Verif F");
		}
	}

	private void CheckMarco() {
		RX=true;
		SX=true;
		RY=true;
		SY=true;
System.out.println("CheckMarco");
		cont=cont+1;
		if (C_Ancho == 0) {
			RX = false;
		} else if (C_Ancho == (super.Ancho - 1)) {
			SX = false;
		}
		if (C_Alto == 0) {
			RY = false;
		} else if (C_Alto == (super.Alto - 1)) {
			SY = false;
		}
	}

	private void A1() {
		E1 = Verif;
		if (Uso1 > 0) {
			Lid = true;
		}
		Lid1 = Lid;
		if (RX == true && RY == true && E1 == true && Lid1 == true) {
			C_Ancho = C_Ancho - 1;
			C_Alto = C_Alto - 1;
			Lid = false;
			Uso1 = Uso1 + 1;
			System.out.println("A1 Tre");
		} else {
			if (Uso1 > 0) {
				C_Ancho = C_Ancho + Uso1;
				C_Alto = C_Alto + Uso1;
				Uso1 = 0;
				Lid = true;
				Verif = true;
				System.out.println("A1 False");
			}
			CheckMarco();
			System.out.println("A1 Empty");
		}
	}

	private void A2() {
		E2 = Verif;
		if (Uso2 > 0) {
			Lid = true;
		}
		Lid2 = Lid;
		if (RY == true && E2 == true && Lid2 == true) {
			C_Alto = C_Alto - 1;
			Lid = false;
			Uso2 = Uso2 + 1;
			System.out.println("A2 Tre");
		} else {
			if (Uso2 > 0) {
				C_Alto = C_Alto + Uso2;
				Uso2 = 0;
				Lid = true;
				Verif = true;
				System.out.println("A2 False");
			}
			CheckMarco();
			System.out.println("A2 Empty");
		}
	}

	private void A3() {
		E3 = Verif;
		if (Uso3 > 0) {
			Lid = true;
		}
		Lid3 = Lid;
		if (SX == true && RY == true && E3 == true && Lid3 == true) {
			C_Ancho = C_Ancho + 1;
			C_Alto = C_Alto - 1;
			Lid = false;
			Uso3 = Uso3 + 1;
			System.out.println("A3 Tre");
		} else {
			if (Uso3 > 0) {
				C_Ancho = C_Ancho - Uso3;
				C_Alto = C_Alto + Uso3;
				Uso3 = 0;
				Lid = true;
				Verif = true;
				System.out.println("A3 False");
			}
			CheckMarco();
			System.out.println("A3 Empty");
		}
	}

	private void M1() {
		E4 = Verif;
		if (Uso4 > 0) {
			Lid = true;
		}
		Lid4 = Lid;
		if (RX == true && E4 == true && Lid4 == true) {
			C_Ancho = C_Ancho - 1;
			Lid = false;
			Uso4 = Uso4 + 1;
			System.out.println("M1 Tre");
		} else {
			if (Uso4 > 0) {
				C_Ancho = C_Ancho + Uso4;
				Uso4 = 0;
				Lid = true;
				Verif = true;
				System.out.println("M1 False");
			}
			CheckMarco();
			System.out.println("M1 Empty");
		}
	}

	private void M3() {
		E5 = Verif;
		if (Uso5 > 0) {
			Lid = true;
		}
		Lid5 = Lid;
		if (SX == true && E5 == true && Lid5 == true) {
			C_Ancho = C_Ancho + 1;
			Lid = false;
			Uso5 = Uso5 + 1;
			System.out.println("M3 Tre");
		} else {
			if (Uso5 > 0) {
				C_Ancho = C_Ancho - Uso5;
				Uso5 = 0;
				Lid = true;
				Verif = true;
				System.out.println("M3 False");
			}
			CheckMarco();
			System.out.println("M3 Empty");
		}
	}

	private void B1() {
		E6 = Verif;
		if (Uso6 > 0) {
			Lid = true;
		}
		Lid6 = Lid;
		if (RX == true && SY == true && E6 == true && Lid6 == true) {
			C_Ancho = C_Ancho - 1;
			C_Alto = C_Alto + 1;
			Lid = false;
			Uso6 = Uso6 + 1;
			System.out.println("B1 Tre");
		} else {
			if (Uso6 > 0) {
				C_Ancho = C_Ancho + Uso6;
				C_Alto = C_Alto - Uso6;
				Uso6 = 0;
				Lid = true;
				Verif = true;
				System.out.println("B1 False");
			}
			CheckMarco();
			System.out.println("B1 Empty");
		}
	}

	private void B2() {
		E7 = Verif;
		if (Uso7 > 0) {
			Lid = true;
		}
		Lid7 = Lid;
		if (SY == true && E7 == true && Lid7 == true) {
			C_Alto = C_Alto + 1;
			Lid = false;
			Uso7 = Uso7 + 1;
			System.out.println("B2 Tre");
		} else {
			if (Uso7 > 0) {
				C_Alto = C_Alto - Uso7;
				Uso7 = 0;
				Lid = true;
				Verif = true;
				System.out.println("B2 False");
			}
			CheckMarco();
			System.out.println("B2 Empty");
		}
	}

	private void B3() {
		E8 = Verif;
		if (Uso8 > 0) {
			Lid = true;
		}
		Lid8 = Lid;
		if (SX == true && SY == true && E8 == true && Lid8 == true) {
			C_Ancho = C_Ancho + 1;
			C_Alto = C_Alto + 1;
			Lid = false;
			Uso8 = Uso8 + 1;
			System.out.println("B3 Tre");
		} else {
			if (Uso8 > 0) {
				C_Ancho = C_Ancho - Uso8;
				C_Alto = C_Alto - Uso8;
				Uso8 = 0;
				Lid = true;
				Verif = false;
				BusVenActiv = false;
				System.out.println("B3 False");
			}
			CheckMarco();
			System.out.println("B3 Empty");
		}
	}
	
	private void Progresion() {
		if(BusVenActiv==false) {
			if(C_Ancho<(super.Ancho-1)) {
				C_Ancho=C_Ancho+1;
				System.out.println("Progresion ancho+1 BuscVenAct=false");
			}
			else {
				C_Ancho=0;
				C_Alto=C_Alto+1;
				System.out.println("Ancho 0, Alto+1 BuscVenAct=false");
			}
			LAct=0;
		}
		else if(BusVenActiv==true) {
			if(Verif==true) {
				LAct=LAct+1;	
				System.out.println("BusVenActiv= true LAct+1");
			}
			else {
				LAct=1;
				System.out.println("BusVenActiv= true LAct=1");
			}
		}
	}
	
	private void Almacen() {
		if(Verif==true) {
			AnchoAlm[LAct]=C_Ancho;
			AltoAlm[LAct]=C_Alto;
			System.out.println("Guardando coordenadas");
		}
		else if(Verif==false) {
			int a=0;
			while(a<(Len-1)) {
				AnchoAlm[a+1]=-1;
				AltoAlm[a+1]=-1;
				a=a+1;
				System.out.println("Vaciando Almacenes");
			}
		}
		if(AnchoAlm[(Len-1)]!=-1) {
			Final=true;
		}
	}
	
	private void Impresor() {
		int a=0;
		while(a<Len) {
			System.out.println("Par "+(a+1)+" "+AnchoAlm[a]+" "+AltoAlm[a]);
			a=a+1;
		}
		System.out.println("Total ciclos= "+cont);
	}

public void Solucion() {
	Iniciar();
	Solicitador();
	while(Final==false) {
	Divisor();
	BuscLineal();
	Verificador();
	Almacen();
	Progresion();
	CheckMarco();
	A1();
	A2();
	A3();
	M1();
	M3();
	B1();
	B2();
	B3();
	}
	Impresor();
}
}
