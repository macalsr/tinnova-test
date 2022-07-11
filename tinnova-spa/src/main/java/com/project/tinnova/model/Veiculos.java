package com.project.tinnova.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "veiculo", nullable = false, length = 50)
    private String veiculo;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "ano", nullable = false)
    private Integer ano;

    @Column(name = "descricao", nullable = false, length = 500)
    private String descricao;

    @Column(name = "vendido", nullable = false)
    private Boolean vendido;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Veiculos veiculos = (Veiculos) o;
        return id != null && Objects.equals(id, veiculos.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
