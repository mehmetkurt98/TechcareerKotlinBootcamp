package com.mehmetkurt.techcareerhomework.odev4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.mehmetkurt.techcareerhomework.R
import kotlinx.android.synthetic.main.fragment_anasayfa.*
import navigateToNextFragment


class AnasayfaFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_anasayfa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //burda yazıyoruz çünkü bu fonksiyon görünümler oluşunca çağırılıyor.Diperleri görünümler oluşmadan çağırabilir.
        super.onViewCreated(view, savedInstanceState)
        gitA.setOnClickListener {
            navigateToNextFragment(R.id.sayfaAFragment)
        }
        gitX.setOnClickListener {
            navigateToNextFragment(R.id.sayfaXFragment)
        }

    }

}