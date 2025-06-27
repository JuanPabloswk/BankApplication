package com.example.nequisito.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;
    @Column(name = "nombres_usuario")
    private String nombres;
    @Column(name = "apellido")
    private String apellidos;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    @Column(name = "fecha_modificacion")
    private LocalDate fechaModificacion;


//    @ManyToOne
//    @JoinColumn(name = "role_id_usuario")
//    private Role role;
//
//    @Enumerated(EnumType.STRING)
//    private RolesEnum roles;
//
//    public static void main(String[] args) {
//        User a = User.builder()
//                .id(1)
//                .name("a")
//                .roles(RolesEnum.USUARIO)
//                .build();
//    }

}