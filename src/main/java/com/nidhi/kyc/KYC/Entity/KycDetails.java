package com.nidhi.kyc.KYC.Entity;

import com.nidhi.kyc.KYC.Enum.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Entity
@Data
@Validated
public class KycDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long kycId;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String fatherLastName;
    @Email(message = "Invalid email address")
    private String email;
    private Long phnNo;
    @Enumerated(EnumType.STRING)
    private Education education;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Religion religion;
    @Enumerated(EnumType.STRING)
    private NationalityType nationalityType;
    @Enumerated(EnumType.STRING)
    private Category category;
    private Long alternatePhnNo;
    private String nomineeFirstName;
    private String nomineeLastName;
    private Long nomineeContactNumber;
    private String relationWithNominee;
    @Enumerated(EnumType.STRING)
    private Occupation occupation;
    private Integer monthlyIncome;
    private Integer numberOfFamilyMembers;
}


