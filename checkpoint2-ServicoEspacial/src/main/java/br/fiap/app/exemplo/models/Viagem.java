package br.fiap.app.exemplo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Viagem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String dtoDecolagem;
	private int estadia;
	private int assentos;
	@Pattern(regexp = "[a-z]{4}-\\d{4}", message = "Formato de modelo inválido!")
	private String modeloNave;
	@NotNull
	private String primeiroComandante;
	
	@Pattern(regexp="[a-zA-Z]{3}-\\d{4}-[a-zA-Z]\\d[a-zA-Z]", message = "formato inválido!")
	private String matriculaPrimeiro;

	@NotNull
	private String segundoComandante;
	
	@Pattern(regexp="[a-zA-Z]{3}-\\d{4}-[a-zA-Z]\\d[a-zA-Z]", message = "formato inválido!")
	private String matriculaSegundo;

	private String dtoRetorno;

}
