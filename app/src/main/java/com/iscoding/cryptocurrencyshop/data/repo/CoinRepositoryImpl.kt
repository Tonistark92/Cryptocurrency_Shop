package com.iscoding.cryptocurrencyshop.data.repo

import com.iscoding.cryptocurrencyshop.data.remote.CoinPaprikaApi
import com.iscoding.cryptocurrencyshop.data.remote.dto.CoinDetailDto
import com.iscoding.cryptocurrencyshop.data.remote.dto.CoinDto
import com.iscoding.cryptocurrencyshop.domain.repo.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}