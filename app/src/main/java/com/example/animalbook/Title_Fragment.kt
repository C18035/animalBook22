package com.example.animalbook


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_title_.*


// TODO: Rename parameter arguments, choose name that match

//private const val ARG_PARM1="parm1"
//private const val ARG_PARM2="parm2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Title_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_title_, container, false)
    }

    fun setTitle(title:String){
        titleText.text=title
    }
}
