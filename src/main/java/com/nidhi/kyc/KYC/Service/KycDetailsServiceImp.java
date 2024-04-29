package com.nidhi.kyc.KYC.Service;

import com.nidhi.kyc.KYC.Dto.KycDetailsDto;
import com.nidhi.kyc.KYC.Entity.KycDetails;
import com.nidhi.kyc.KYC.Repo.KycDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KycDetailsServiceImp implements KycDetailsService {

    @Autowired
    private KycDetailsRepo kycDetailsRepo;

    @Override
    public KycDetailsDto saveKycDetails(KycDetailsDto kycDetailsDTO) {

        KycDetails kycDetails = convertToEntity(kycDetailsDTO);
        kycDetailsRepo.save(kycDetails);
        return kycDetailsDTO;
    }

    private KycDetails convertToEntity(KycDetailsDto kycDto) {
        KycDetails kycEntity = new KycDetails();
        kycEntity.setFirstName(kycDto.getFirstName());
        kycEntity.setLastName(kycDto.getLastName());
        kycEntity.setFatherName(kycDto.getFatherName());
        kycEntity.setFatherLastName(kycDto.getFatherLastName());
        kycEntity.setEmail(kycDto.getEmail());
        kycEntity.setPhnNo(kycDto.getPhnNo());
        kycEntity.setEducation(kycDto.getEducation());
        kycEntity.setGender(kycDto.getGender());
        kycEntity.setDateOfBirth(kycDto.getDateOfBirth());
        kycEntity.setReligion(kycDto.getReligion());
        kycEntity.setNationalityType(kycDto.getNationalityType());
        kycEntity.setCategory(kycDto.getCategory());
//        kycEntity.setOccupation(kycDto.getOccupation());
        kycEntity.setAlternatePhnNo(kycDto.getAlternatePhnNo());
        kycEntity.setNomineeFirstName(kycDto.getNomineeFirstName());
        kycEntity.setNomineeLastName(kycDto.getNomineeLastName());
        kycEntity.setNomineeContactNumber(kycDto.getNomineeContactNumber());
        kycEntity.setRelationWithNominee(kycDto.getRelationWithNominee());
        kycEntity.setOccupation(kycDto.getOccupation());
        kycEntity.setMonthlyIncome(kycDto.getMonthlyIncome());
        kycEntity.setNumberOfFamilyMembers(kycDto.getNumberOfFamilyMembers());
        return kycEntity;
    }


//    public KycDetailsDto saveKycDetails(KycDetailsDto kycDetailsDTO) {
//        KycDetails kycDetails = new KycDetails();
//        kycDetails.setFirst_name(kycDetailsDTO.getFirstName());
//        kycDetails.setLast_name(kycDetailsDTO.getLastName());
//        kycDetails.setFather_name(kycDetailsDTO.getFatherName());
//        kycDetails.setFather_last_name(kycDetailsDTO.getFatherLastName());
//        kycDetails.setEmail(kycDetailsDTO.getEmail());
//        kycDetails.setPhn_no(kycDetailsDTO.getPhoneNumber());
//        kycDetails.setEduction(kycDetailsDTO.getEducation());
//        kycDetails.setGender(kycDetailsDTO.getGender());
//        kycDetails.setReligion(kycDetailsDTO.getReligion());
//        kycDetails.setCategory(kycDetailsDTO.getCategory());
//        kycDetails.setOccupation(kycDetails.getOccupation());
//        kycDetails.setAlternate_phn_no(kycDetailsDTO.getAlternatePhoneNumber());
//        kycDetails.setNominee_First_Name(kycDetailsDTO.getNomineeFirstName());
//        kycDetails.setNominee_last_name(kycDetailsDTO.getNomineeLastName());
//        kycDetails.setNominee_Phn_no(kycDetailsDTO.getNomineePhoneNumber());
//        kycDetails.setRelation_with_nominee(kycDetailsDTO.getRelationWithNominee());
//        kycDetails.setMonthly_Income(kycDetailsDTO.getMonthlyIncome());
//        kycDetails.setNo_of_family_member(kycDetailsDTO.getNumberOfFamilyMembers());
//        kycDetails.setWho_are_you_in_the_family(kycDetailsDTO.getRoleInFamily());
//
//        KycDetails savedKycDetails = kycDetailsRepo.save(kycDetails);
//
//        return mapToDto(savedKycDetails);
//
//    }
//        private KycDetailsDto mapToDto(KycDetails kycDetails){
//            KycDetailsDto dto = new KycDetailsDto();
//
//            dto.setFirstName(kycDetails.getFirst_name());
//            dto.setLastName(kycDetails.getLast_name());
//            dto.setFatherName(kycDetails.getFather_name());
//            dto.setFatherLastName(kycDetails.getFather_last_name());
//            dto.setEmail(kycDetails.getEmail());
//            dto.setPhoneNumber(kycDetails.getPhn_no());
//            dto.setEducation(kycDetails.getEduction());
//            dto.setGender(kycDetails.getGender());
//            dto.setReligion(kycDetails.getReligion());
//            dto.setCategory(kycDetails.getCategory());
//            dto.setOccupation(kycDetails.getOccupation());
//            dto.setAlternatePhoneNumber(kycDetails.getAlternate_phn_no());
//            dto.setNomineeFirstName(kycDetails.getNominee_First_Name());
//            dto.setNomineeLastName(kycDetails.getNominee_last_name());
//            dto.setNomineePhoneNumber(kycDetails.getNominee_Phn_no());
//            dto.setRelationWithNominee(kycDetails.getRelation_with_nominee());
//            dto.setMonthlyIncome(kycDetails.getMonthly_Income());
//            dto.setNumberOfFamilyMembers(kycDetails.getNo_of_family_member());
//            dto.setRoleInFamily(kycDetails.getWho_are_you_in_the_family());
//
//            return dto;
//        }
}
