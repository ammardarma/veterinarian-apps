package com.ammar.veterinariansapps

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class VetDetails : AppCompatActivity() {
    private lateinit var txtVetNameDetail : TextView
    private lateinit var txtVetAddressDetail : TextView
    private lateinit var txtVetCityDetail : TextView
    private lateinit var ivVetPhotoDetail : ImageView
    private lateinit var txtVetPhoneDetail : TextView
    private lateinit var txtVetOpenHoursDetail : TextView
    private lateinit var txtVetCloseHoursDetail : TextView
    private lateinit var btnVetLinkMaps : TextView
    private lateinit var btnShare : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vet_details)

        var actionBar = supportActionBar
            actionBar?.setDisplayHomeAsUpEnabled(true)


        txtVetNameDetail = findViewById(R.id.vetNameDetail)
        txtVetAddressDetail =findViewById(R.id.vetAddressDetail)
        txtVetCityDetail = findViewById(R.id.vetCityDetail)
        ivVetPhotoDetail = findViewById(R.id.tvVetPhotoDetail)
        txtVetPhoneDetail = findViewById(R.id.vetPhoneDetail)
        txtVetOpenHoursDetail = findViewById(R.id.vetOpenHoursDetail)
        txtVetCloseHoursDetail = findViewById(R.id.vetCloseHoursDetail)
        btnVetLinkMaps = findViewById(R.id.openGoogleMaps)
        btnShare = findViewById(R.id.share)

        val gambar = intent.getIntExtra("photo", 0)

        Glide.with(this)
                .load(gambar)
                .apply(RequestOptions().override(270, 270))
                .into(ivVetPhotoDetail)

        txtVetNameDetail.text = intent.getStringExtra("name")
        txtVetAddressDetail.text = intent.getStringExtra("address")
        txtVetCityDetail.text = intent.getStringExtra("city")
        txtVetPhoneDetail.text = intent.getStringExtra("phone")
        txtVetOpenHoursDetail.text = intent.getStringExtra("openHours")
        txtVetCloseHoursDetail.text = intent.getStringExtra("closeHours")

        val uri = intent.getStringExtra("linkMaps")

        actionBar?.title = intent.getStringExtra("name")

        btnVetLinkMaps.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent2.setPackage("com.google.android.apps.maps")
            startActivity(intent2)
        }

        btnShare.setOnClickListener {
            val intent3 = Intent(Intent.ACTION_SEND)
            intent3.type = "text/plain"
            intent3.putExtra(Intent.EXTRA_TEXT, uri.toString())
            startActivity(Intent.createChooser(intent3, "Share Using"))
        }



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                finish()
            return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}