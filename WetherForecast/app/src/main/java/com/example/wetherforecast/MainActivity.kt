package com.example.wetherforecast
import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import android.widget.Button
import androidx.core.content.ContextCompat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)


        button.setOnClickListener{
            checkPermission()
        }

    }

    private fun checkPermission() {
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),1)
        }else{
            getLocations()
        }
    }

    @SuppressLint("MissingPermission")
    private fun getLocations(){
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        fusedLocationProviderClient.lastLocation?.addOnSuccessListener {
                if(it==null){
                    Toast.makeText(this,"Sorry Can't get Location",Toast.LENGTH_SHORT).show()

                }else it.apply{
                    val latitude = it.latitude
                    var longitude = it.longitude
                    textView1.text=latitude.toString()
                    textView2.text = longitude.toString()

                }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==1){
            if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_DENIED){
                    Toast.makeText(this,"PERMISSION GRANTED",Toast.LENGTH_SHORT).show()
                    getLocations()
                }else{
                    Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT)
                }
            }
        }
    }

}