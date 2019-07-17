package org.phenocraft

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware


class PhenoCraftApp() : Application(), KodeinAware  {

    override val kodein by Kodein.lazy {


    }

}