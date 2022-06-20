package com.mehmetkurt.techcareerhomework.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mehmetkurt.techcareerhomework.R
import kotlinx.android.synthetic.main.fragment_anasayfa.*
import kotlinx.android.synthetic.main.fragment_sayfa_y.*
import navigateToNextFragment


class SayfaYFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sayfa_y, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //burda yazıyoruz çünkü bu fonksiyon görünümler oluşunca çağırılıyor.Diperleri görünümler oluşmadan çağırabilir.
        super.onViewCreated(view, savedInstanceState)
        geriGit.setOnClickListener {
            navigateToNextFragment(R.id.anasayfaFragment)
        }


    }

}