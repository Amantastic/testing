package com.nidhi.kyc.KYC.Service;

import com.nidhi.kyc.KYC.Dto.IdentityDocsDto;
import org.springframework.web.multipart.MultipartFile;

public interface IdentityDocsService {

    IdentityDocsDto saveIdentityDocs(IdentityDocsDto identityDocsDto,
                                     MultipartFile aadharImageFront,
                                     MultipartFile aadharImageBack,
                                     MultipartFile panImage,
                                     MultipartFile passbookImage,
                                     MultipartFile voterIdImageFront,
                                     MultipartFile voterIdImageBack,
                                     MultipartFile profilePhoto);
}
