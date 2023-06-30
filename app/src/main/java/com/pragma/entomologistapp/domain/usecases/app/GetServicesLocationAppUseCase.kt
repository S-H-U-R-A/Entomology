package com.pragma.entomologistapp.domain.usecases.app

import com.pragma.entomologistapp.domain.repository.ServiceLocationRepository
import javax.inject.Inject

class GetServicesLocationAppUseCase @Inject constructor(
    private val serviceLocationRepository: ServiceLocationRepository
) {
    suspend operator fun invoke() : Boolean{
        return serviceLocationRepository.checkLocationServicesEnabled()
    }

}