package com.example.act7.viewmodel

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.act7.AplikasiSiswa
import androidx.lifecycle.ViewModelProvider

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari
 *  [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)