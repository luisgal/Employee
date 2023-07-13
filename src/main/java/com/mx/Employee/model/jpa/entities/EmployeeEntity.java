package com.mx.Employee.model.jpa.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEES")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTHDATE")
    private Date birthdate;
    
    @ManyToOne()
    @JoinColumn(name = "GENDER_ID")
    private GenderEntity gender;

    @ManyToOne
    @JoinColumn(name = "JOB_ID")
    private JobEntity job;
    
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeWorkedHoursEntity> workedHoursList;

	public EmployeeEntity(Long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthdate=" + birthdate
				+ ", gender=" + gender.getName() + ", job=" + job.getName() + "]";
	}
	
	
}
