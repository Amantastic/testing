package com.nidhi.kyc.KYC.Repo;

import com.nidhi.kyc.KYC.Entity.IdentityDocs;
import com.nidhi.kyc.KYC.Entity.KycDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KycDetailsRepo extends JpaRepository<KycDetails,Long> {
}
