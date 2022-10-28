package com.bridgelabz.emppayroll.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpData {
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}",message = "Invalid Name")
	private String name;
	@NotBlank(message = "Profile should not blank")
	private String profile;
	@NotNull(message = "please select gender")
	private String gender;
	@NotNull(message = "please select date")
	private LocalDate date;
	@NotBlank(message = "please select department")
	private String department;
	@Min(300000)
	@Max(600000)
	private long salary;
	private String note;
	
}
