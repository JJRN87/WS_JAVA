package javabeans;

import java.time.LocalDate;
import java.util.ArrayList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString

public class Cliente2 {
	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createAt;
	private DireccionCliente direccion;
	private ArrayList<TarjetaBancaria> tarjetas;

	
	
	
}
