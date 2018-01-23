package com.anovan.kosong

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.ads.AdSize
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, "ca-app-pub-6793022751700770~6253670949")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

    }
}
