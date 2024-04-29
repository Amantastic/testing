package com.nidhi.kyc.KYC.Service;

import com.nidhi.kyc.KYC.Dto.IdentityDocsDto;
import com.nidhi.kyc.KYC.Entity.IdentityDocs;
import com.nidhi.kyc.KYC.Repo.IdentityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;

@Service
public class IdentityDocsServiceImp implements IdentityDocsService {

    @Autowired
    private IdentityRepo identityRepo;

    @Override
    public IdentityDocsDto saveIdentityDocs(IdentityDocsDto identityDocsDto,
                                            MultipartFile aadharImageFront,
                                            MultipartFile aadharImageBack,
                                            MultipartFile panImage,
                                            MultipartFile passbookImage,
                                            MultipartFile voterIdImageFront,
                                            MultipartFile voterIdImageBack,
                                            MultipartFile profilePhoto) {
        IdentityDocs identityDocs = new IdentityDocs();

        identityDocs.setAadharNumber(identityDocsDto.getAadharNumber());
        identityDocs.setPanNumber(identityDocsDto.getPanNumber());
        identityDocs.setAccountNumber(identityDocsDto.getAccountNumber());
        identityDocs.setIFSC_Code(identityDocsDto.getIfscCode());
        identityDocs.setBankName(identityDocsDto.getBankName());
        identityDocs.setVoterIdNo(identityDocsDto.getVoterIdNo());

        try {
            // Convert MultipartFile to byte array (you may need to adjust this based on your requirements)
            byte[] aadharImageFrontBytes = aadharImageFront.getBytes();
            byte[] aadharImageBackBytes = aadharImageBack.getBytes();
            byte[] panImageBytes = panImage.getBytes();
            byte[] passbookImageBytes = passbookImage.getBytes();
            byte[] voterIdImageFrontBytes = voterIdImageFront.getBytes();
            byte[] voterIdImageBackBytes = voterIdImageBack.getBytes();
            byte[] profilePhotoBytes = profilePhoto.getBytes();

            // Save byte arrays to entity
            identityDocs.setAadharImageFront(Arrays.toString(aadharImageFrontBytes));
            identityDocs.setAadharImageBack(Arrays.toString(aadharImageBackBytes));
            identityDocs.setPanImage(Arrays.toString(panImageBytes));
            identityDocs.setPassbookImage(Arrays.toString(passbookImageBytes));
            identityDocs.setVoterIdImageFront(Arrays.toString(voterIdImageFrontBytes));
            identityDocs.setVoterIdImageBack(Arrays.toString(voterIdImageBackBytes));
            identityDocs.setProfilePhoto(Arrays.toString(profilePhotoBytes));
        } catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
            return null; // Or throw an exception
        }
        IdentityDocs savedIdentityDocs = identityRepo.save(identityDocs);

        // Return the DTO directly without mapping
        return identityDocsDto;
    }
}
