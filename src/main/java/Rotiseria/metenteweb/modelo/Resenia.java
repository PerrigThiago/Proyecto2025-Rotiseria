package Rotiseria.metenteweb.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "resenia")
public class Resenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long idComentario;

    @Column(nullable = false, length = 255)
    private String texto;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private int autoriza;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    public Resenia(String texto, LocalDate fecha, int autoriza) {
        this.texto = texto;
        this.fecha = fecha;
        this.autoriza = autoriza;
    }

    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(int autoriza) {
        this.autoriza = autoriza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
