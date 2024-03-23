package com.iscoding.cryptocurrencyshop.domain.repo

import com.iscoding.cryptocurrencyshop.data.remote.dto.CoinDetailDto
import com.iscoding.cryptocurrencyshop.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}