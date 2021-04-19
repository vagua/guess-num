package com.example.app2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.app2.databinding.FragmentGameBinding
import com.example.app2.databinding.FragmentWelcomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [welcome.newInstance] factory method to
 * create an instance of this fragment.
 */
class welcome : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.playbtn.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_welcome_to_game)
        }
    }

}
