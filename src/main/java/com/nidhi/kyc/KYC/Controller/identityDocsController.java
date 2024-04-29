package com.nidhi.kyc.KYC.Controller;

import com.nidhi.kyc.KYC.Dto.IdentityDocsDto;
import com.nidhi.kyc.KYC.Service.IdentityDocsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/kyc")
public class identityDocsController {

    @Autowired
    private IdentityDocsService identityDocsService;

    @PostMapping(value = "/identitydocs", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> saveIdentityDocs(@Valid @RequestBody IdentityDocsDto identityDocsDto,
                                                   @RequestParam("aadharImageFront") MultipartFile aadharImageFront,
                                                   @RequestParam("aadharImageBack") MultipartFile aadharImageBack,
                                                   @RequestParam("panImage") MultipartFile panImage,
                                                   @RequestParam("passbookImage") MultipartFile passbookImage,
                                                   @RequestParam("voterIdImageFront") MultipartFile voterIdImageFront,
                                                   @RequestParam("voterIdImageBack") MultipartFile voterIdImageBack,
                                                    @RequestParam("profilePhoto") MultipartFile profilePhoto) {
        // Call the service to save identity documents
        IdentityDocsDto savedIdentityDocs = identityDocsService.saveIdentityDocs(identityDocsDto,
                                                                                  aadharImageFront,
                                                                                  aadharImageBack,
                                                                                  panImage,
                                                                                  passbookImage,
                                                                                  voterIdImageFront,
                                                                                  voterIdImageBack,
                                                                                  profilePhoto);

        if (savedIdentityDocs != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Identity documents saved successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save identity documents.");
        }
    }
}

//    public ResponseEntity<String> saveIdentityDocs(@Valid @RequestBody IdentityDocsDto identityDocsDto) {
//        // Call the service to save identity documents
//        IdentityDocsDto savedIdentityDocs = identityDocsService.saveIdentityDocs(identityDocsDto);
//
//        if (savedIdentityDocs != null) {
//            return ResponseEntity.status(HttpStatus.CREATED).body("Identity documents saved successfully.");
//        } else {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save identity documents.");
//        }
//    }


