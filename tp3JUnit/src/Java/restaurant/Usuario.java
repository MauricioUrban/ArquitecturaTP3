package Java.restaurant;

import java.util.Date;

public class Usuario {
static int nextID;
int id;
String nombreYApellido;
int tipoUsuario;
float saldoCuenta;
Date ultimaRecarga;
String email;
public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta,String email) {
	super();
	this.nombreYApellido = nombreYApellido;
	this.tipoUsuario = tipoUsuario;
	this.saldoCuenta = saldoCuenta;
	this.email=email;
}

public void cargarCredito(float cuanto) {
	saldoCuenta+=cuanto;
	
}
float descontarSaldo(float cuanto) throws SinSaldoException {
	if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
	else
		saldoCuenta-= cuanto;
	return saldoCuenta;
	
}
float getSaldo() {
	return saldoCuenta;
}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return email != null && email.equals(other.getEmail());
	}

	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}

	public String getEmail() {
		return email;
	}
}
