package com.poly.model;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@NotBlank(message = "{NotBlank.sv.name}")
	String name;

	@Email(message = "Vui lòng nhập đúng định dạng email")
	@NotBlank(message = "{NotBlank.sv.email}")
	String email;

	@Min(value = 0, message = "{Min.sv.marks}")
	@Max(value = 10, message = "Max.sv.marks")
	@NotNull(message = "{NotNull.sv.marks}")
	Double marks;

	@NotNull(message = "{NotNull.sv.gender}")
	Boolean gender;

	@NotBlank(message = "{NotBlank.sv.faculty}")
	String faculty;

	@NotEmpty(message = "{NotEmpty.sv.hobbies}")
	List<String> hobbies;

}
