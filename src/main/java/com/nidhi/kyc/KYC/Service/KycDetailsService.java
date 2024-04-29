package com.nidhi.kyc.KYC.Service;

import com.nidhi.kyc.KYC.Dto.KycDetailsDto;
import com.nidhi.kyc.KYC.Repo.KycDetailsRepo;
import org.springframework.stereotype.Service;


public interface KycDetailsService {

    KycDetailsDto saveKycDetails(KycDetailsDto kycDetailsDTO);
}
