package org.jellyfin.androidtv.di

import org.jellyfin.androidtv.preference.SystemPreferences
import org.jellyfin.androidtv.preference.UserPreferences
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val preferenceModule = module {
	single {
		UserPreferences(androidApplication())
	}

	single {
		SystemPreferences(androidApplication())
	}
}
