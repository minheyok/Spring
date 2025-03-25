package kr.co.sboard.service;


import kr.co.sboard.dto.TermsDTO;
import kr.co.sboard.entity.Terms;
import kr.co.sboard.repository.TernsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TermsService {

    private final TernsRepository termsRepository;
    private final ModelMapper modelMapper;

    public TermsDTO terms(){
        Optional<Terms> optTerms = termsRepository.findById(1);

        if(optTerms.isPresent()){
            Terms terms = optTerms.get();

            TermsDTO termsDTO = modelMapper.map(terms, TermsDTO.class);
            return termsDTO;
        }
        return null;

    }
}
