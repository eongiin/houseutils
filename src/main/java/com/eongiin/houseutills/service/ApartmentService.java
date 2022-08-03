package com.eongiin.houseutills.service;

import com.eongiin.houseutills.exception.ErrorCode;
import com.eongiin.houseutills.exception.HouseUtilsException;
import com.eongiin.houseutills.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceOrThrow(Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUNT))
                .getPrice();
    }

}
