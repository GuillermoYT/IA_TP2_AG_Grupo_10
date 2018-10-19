package tpgrupo10;

import tpgrupo10.Cromosoma.FechaNacimiento;
import tpgrupo10.Cromosoma.LugarNacimiento;
import tpgrupo10.Cromosoma.Dedicacion;
import tpgrupo10.Cromosoma.OtrasActividades;
import tpgrupo10.Cromosoma.Personaje;

public class PersonajeGrecia {

	private Personaje personaje;
	private FechaNacimiento fecha_nac;
	private LugarNacimiento lugar_nac;
	private Dedicacion dedicacion;
	private OtrasActividades otras;

	public PersonajeGrecia(Personaje pjGrecia, FechaNacimiento fechaNac, LugarNacimiento LugarNac, Dedicacion dedic, OtrasActividades actividades) {
		this.personaje = pjGrecia;
		this.fecha_nac = fechaNac;
		this.lugar_nac = LugarNac;
		this.dedicacion = dedic;
		this.otras = actividades;
	}

	public String printPersonaje(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("{");
		buffer.append("Nombre:"+this.personaje);
		buffer.append(",");
		buffer.append("Fecha nacimiento:"+this.fecha_nac);
		buffer.append(",");
		buffer.append("Lugar Nacimiento:"+this.lugar_nac);
		buffer.append(",");
		buffer.append("Dedicacion:"+this.dedicacion);
		buffer.append(",");		
		buffer.append("Otras Actividades:"+this.otras);
		buffer.append("}");		
		return buffer.toString();
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public FechaNacimiento getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(FechaNacimiento fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public LugarNacimiento getLugar_nac() {
		return lugar_nac;
	}

	public void setLugar_nac(LugarNacimiento lugar_nac) {
		this.lugar_nac = lugar_nac;
	}

	public Dedicacion getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(Dedicacion dedicacion) {
		this.dedicacion = dedicacion;
	}

	public OtrasActividades getOtras() {
		return otras;
	}

	public void setOtras(OtrasActividades otras) {
		this.otras = otras;
	}

}
