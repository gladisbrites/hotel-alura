package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import Factory.ConnectionFactory;
import dao.HuespedesDAO;
import modelo.Huespedes;

public class HuespedesController {
	 private HuespedesDAO huespedDAO;
	 
	 public HuespedesController() {
			Connection connection = new ConnectionFactory().recuperarConexion();
			this.huespedDAO = new HuespedesDAO(connection);
		}
	 
		public void guardar(Huespedes huespedes) {
			this.huespedDAO.guardar(huespedes);
		}
		public List<Huespedes> listarHuespedes() {
			return this.huespedDAO.listarHuespedes();
		}
		
		public List<Huespedes> listarHuespedesPorApellido(String apellido) {
			return this.huespedDAO.buscarPorApellido(apellido);
		}
		
		public void actualizar(String nombre, String apellido, Date fechaN, String nacionalidad, String telefono, Integer idReserva, Integer id) {
			this.huespedDAO.Actualizar(nombre, apellido, fechaN, nacionalidad, telefono, idReserva, id);
		}
		
		public void Eliminar(Integer id) {
			this.huespedDAO.Eliminar(id);
		}
}