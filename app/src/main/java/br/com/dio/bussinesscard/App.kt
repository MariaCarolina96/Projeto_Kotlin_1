package br.com.dio.bussinesscard

import android.app.Application
import br.com.dio.bussinesscard.data.AppDatabase
import br.com.dio.bussinesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository: BusinessCardRepository by lazy { BusinessCardRepository(database.businessDao()) }
}