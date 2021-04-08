package common;


public class CrearRut {
	
	public String RutPersona () {
		String rut="";
		int numero;
		int resultado;
		int j=0;
		do {
			numero=0;
			resultado=0;
			for(int i=0;i<8;i++) {
				numero = (int)(Math. random()*9+1);
				resultado=(resultado*10)+numero;
			}
			if(resultado<50000000) {
				j=1;
			}
			else {
				j=0;
			}
		}while(j==0);
		rut=String.valueOf(resultado);
		String dv="";
		int resto=0;
		int suma=0;
		j=2;
		for(int i=0;i<8;i++) {
			resto=resultado%10;
			resultado=resultado/10;
			if(j>7){
				j=2;
				suma=(resto*j)+suma;
			}
			else{
				suma=(resto*j)+suma;
			}
			j++;
		}
		
		int digito=0;
		digito=suma/11;
		digito=digito*11;
		digito=suma-digito;
		
		digito=11-digito;
		
		if(digito==11){
			dv="0";
		}
		else {
			if(digito==10) {
				dv="K";
			}
			else {
				dv=String.valueOf(digito);
			}
		}
		rut=rut+"-"+dv;
		
		return(rut);
	}
	
	public String RutEmpresa () {
		String rut="";
		int numero;
		int resultado;
		int j=0;
		do {
			numero=0;
			resultado=0;
			for(int i=0;i<8;i++) {
				numero = (int)(Math. random()*9+1);
				resultado=(resultado*10)+numero;
			}
			if(resultado>50000000) {
				j=1;
			}
			else {
				j=0;
			}
		}while(j==0);
		rut=String.valueOf(resultado);
		String dv="";
		int resto=0;
		int suma=0;
		j=2;
		for(int i=0;i<8;i++) {
			resto=resultado%10;
			resultado=resultado/10;
			if(j>7){
				j=2;
				suma=(resto*j)+suma;
			}
			else{
				suma=(resto*j)+suma;
			}
			j++;
		}
		
		int digito=0;
		digito=suma/11;
		digito=digito*11;
		digito=suma-digito;
		
		digito=11-digito;
		
		if(digito==11){
			dv="0";
		}
		else {
			if(digito==10) {
				dv="K";
			}
			else {
				dv=String.valueOf(digito);
			}
		}
		rut=rut+"-"+dv;
		
		return(rut);
	}
}
