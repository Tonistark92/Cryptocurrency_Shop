package com.iscoding.cryptocurrencyshop.presentation.coin_list

import com.iscoding.cryptocurrencyshop.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)