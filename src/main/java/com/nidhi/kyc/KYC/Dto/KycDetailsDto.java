package com.nidhi.kyc.KYC.Dto;

import com.nidhi.kyc.KYC.Enum.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KycDetailsDto {

        private String firstName;

        private String lastName;


        private String fatherName;


        private String fatherLastName;


        private String email;


        private Long phnNo;


        private Education education;


        private Gender gender;


        private Date dateOfBirth;


        private Religion religion;


        private NationalityType nationalityType;


        private Category category;


        private Long alternatePhnNo;


        private String nomineeFirstName;

        private String nomineeLastName;

        private Long nomineeContactNumber;

        private String relationWithNominee;

        private Occupation occupation;

        private Integer monthlyIncome;

        private Integer numberOfFamilyMembers;

    }



