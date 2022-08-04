package com.elthobhy.nasatechport.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.elthobhy.nasatechport.core.data.TechportRepository
import com.elthobhy.nasatechport.core.data.local.entity.TechportEntity
import com.elthobhy.nasatechport.core.domain.model.Techport
import com.elthobhy.nasatechport.core.domain.usecase.TechportInteractor
import com.elthobhy.nasatechport.core.domain.usecase.TechportUsecase

class DetailViewModel(private val techport: TechportUsecase): ViewModel() {
    fun getDetail(id: String): LiveData<Techport> =
        techport.getDetail(id)
}
