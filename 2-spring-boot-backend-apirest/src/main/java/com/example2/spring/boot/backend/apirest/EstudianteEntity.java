package com.example2.spring.boot.backend.apirest;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="estudiantes")
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudiante_id;
    private long tipo_documento;
    private String numero_documento;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;
    private String email;
    private int telefojo_fijo;
    private int celular;
    private String nombre_acudiente;
    private Long grado;

    public Long getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(Long estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public long getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(long tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefojo_fijo() {
        return telefojo_fijo;
    }

    public void setTelefojo_fijo(int telefojo_fijo) {
        this.telefojo_fijo = telefojo_fijo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombre_acudiente() {
        return nombre_acudiente;
    }

    public void setNombre_acudiente(String nombre_acudiente) {
        this.nombre_acudiente = nombre_acudiente;
    }

    public Long getGrado() {
        return grado;
    }

    public void setGrado(Long grado) {
        this.grado = grado;
    }
}
