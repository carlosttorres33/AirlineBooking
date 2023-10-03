package com.carlostorres.airlinebooking.presentation

import com.carlostorres.airlinebooking.domain.presentation.Formatter

interface PresentationFactory<T> {

    fun getPresentationFormat(format: PresentationFormat): Formatter<T>

}