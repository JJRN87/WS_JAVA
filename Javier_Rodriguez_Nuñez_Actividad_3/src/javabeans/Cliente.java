package javabeans;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "idCliente")
@ToString

public class Cliente {
	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createAt;
	private DireccionCliente direccion;
	private TarjetaBancaria titularTarjeta;
}
