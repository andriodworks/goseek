package com.softsolution.goseek.fragments.jobSeeker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.softsolution.goseek.R


class ForgetPasswordFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forget_password, container, false)

        val navController = findNavController()
        val button = view.findViewById(R.id.back) as MaterialButton
        button.setOnClickListener {
            navController.popBackStack()
        }

        return view
    }


}