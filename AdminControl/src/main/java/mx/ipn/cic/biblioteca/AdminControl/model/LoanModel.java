package mx.ipn.cic.biblioteca.AdminControl.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestamo")
public class LoanModel {

	// Propiedades privadas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identificador")
	private Integer id;

	@Column(name = "fecha_asignacion")
	private Date startDate;

	@Column(name = "fecha_regreso")
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private BookModel book;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private UserModel user;

	// Constructores
	public LoanModel() {
		super();

	}

	public LoanModel(Integer id, Date startDate, Date endDate, BookModel book, UserModel user) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.book = book;
		this.user = user;
	}

	public LoanModel(Date startDate, Date endDate, BookModel book, UserModel user) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.book = book;
		this.user = user;
	}

	// Métodos de acceso

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BookModel getBook() {
		return book;
	}

	public void setBook(BookModel book) {
		this.book = book;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	// Método toString()

	@Override
	public String toString() {
		return String.format("LoanModel [id=%s, startDate=%s, endDate=%s, book=%s, user=%s]", id, startDate, endDate,
				book, user);
	}

}
