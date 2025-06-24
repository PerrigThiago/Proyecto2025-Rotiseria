package Rotiseria.metenteweb.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "parametro_web")
public class ParametrosWeb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean estado;

    @Column(nullable = false, length = 255)
    private String mensaje;

    @Column(nullable = false, length = 255)
    private String barrido;

    public ParametrosWeb(boolean estado, String mensaje, String barrido) {
        this.estado = estado;
        this.mensaje = mensaje;
        this.barrido = barrido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getBarrido() {
        return barrido;
    }

    public void setBarrido(String barrido) {
        this.barrido = barrido;
    }
}