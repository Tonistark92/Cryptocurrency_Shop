package com.iscoding.cryptocurrencyshop.presentation.coin_detail

import com.iscoding.cryptocurrencyshop.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)